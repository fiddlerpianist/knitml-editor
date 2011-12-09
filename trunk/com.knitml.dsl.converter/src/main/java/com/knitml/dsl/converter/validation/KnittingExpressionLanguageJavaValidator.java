package com.knitml.dsl.converter.validation;

import static com.knitml.validation.visitor.util.InstructionUtils.createExpandedRows;
import static org.eclipse.xtext.validation.CheckType.NORMAL;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.jibx.runtime.JiBXException;
import org.xml.sax.SAXException;

import com.google.inject.Inject;
import com.knitml.core.common.Parameters;
import com.knitml.core.converter.DomainModelConverterLocator;
import com.knitml.core.model.directions.block.RepeatInstruction;
import com.knitml.dsl.converter.emf.helper.EmfHelper;
import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.Pattern;
import com.knitml.engine.common.KnittingEngineException;
import com.knitml.validation.ValidationProgram;
import com.knitml.validation.common.InvalidStructureException;

public class KnittingExpressionLanguageJavaValidator extends
		com.knitml.dsl.validation.KnittingExpressionLanguageJavaValidator {

	@Inject
	protected DomainModelConverterLocator<EObject> locator;
	@Inject
	protected EmfHelper emfHelper;

	@Check(NORMAL)
	public void checkInstruction(Instruction instruction) {
		com.knitml.core.model.directions.block.Instruction modelInstruction = (com.knitml.core.model.directions.block.Instruction) locator
				.locateConverter(instruction).convert(instruction);
		try {
			createExpandedRows(modelInstruction);
		} catch (InvalidStructureException ex) {
			error(ex.getMessage(), null);
		}
	}

	@Check(NORMAL)
	public void checkPattern(Pattern pattern) {
		com.knitml.core.model.Pattern modelPattern = (com.knitml.core.model.Pattern) locator
				.locateConverter(pattern).convert(pattern);
		try {
			testKnitPattern(modelPattern);
		} catch (KnittingEngineException ex) {
			KnittingEngineException root = findRootKnittingEngineException(ex);
			Integer repeatCount = null;
			if (ex.getLocationBreadcrumb() != null) {
				repeatCount = getRepeatCount(ex.getLocationBreadcrumb());
			}

			String errorName = createPhraseFromExceptionClass(root.getClass());
			boolean startsWithVowel = false;
			switch (errorName.charAt(0)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				startsWithVowel = true;
				break;
			default:
				break;
			}
			StringBuilder message = new StringBuilder(startsWithVowel ? "An " : "A ");
			message.append(errorName);
			message.append(" error occurred ");
			if (root.getMessage() != null) {
				message.append("(").append(root.getMessage()).append(")");
			}
			if (repeatCount != null) {
				message.append(" during repeat ").append(repeatCount)
						.append(" of instruction");
			}
			if (ex.getOffendingOperation() != null) {
				EObject emfObject = emfHelper.getEObjectForOperation(ex
						.getOffendingOperation());
				error(message.toString(), emfObject, null,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
			} else {
				error(message.toString(), null);
			}
		}
	}

	private void testKnitPattern(
			com.knitml.core.model.Pattern pattern)
			throws KnittingEngineException {
		ValidationProgram program = new ValidationProgram(true);
		Parameters parameters = new Parameters();
		parameters.setPattern(pattern);
		try {
			program.validate(parameters);
		} catch (KnittingEngineException ex) {
			if (!(ex instanceof InvalidStructureException)) {
				throw ex;
			}
			// else swallow the exception, assuming that another EValidator will pick it up somewhere
		} catch (SAXException ex) {
			// shouldn't happen as we're not using the patterns that throw this
			// exception
			throw new RuntimeException(ex);
		} catch (JiBXException ex) {
			// shouldn't happen as we're not using the patterns that throw this
			// exception
			throw new RuntimeException(ex);
		} catch (IOException ex) {
			// shouldn't happen as we're not using the patterns that throw this
			// exception
			throw new RuntimeException(ex);
		}
	}

	private KnittingEngineException findRootKnittingEngineException(
			KnittingEngineException ex) {
		KnittingEngineException cause = ex;
		while (cause.getCause() instanceof KnittingEngineException) {
			cause = (KnittingEngineException) cause.getCause();
		}
		return cause;
	}

	private String createPhraseFromExceptionClass(Class<?> clazz) {
		String[] words = StringUtils.splitByCharacterTypeCamelCase(clazz
				.getSimpleName());
		if (words[words.length - 1].equalsIgnoreCase("Exception")) {
			words = (String[]) ArrayUtils.remove(words, words.length - 1);
		}
		return StringUtils.join(words, ' ');
	}

	public Integer getRepeatCount(List<Object> locationBreadcrumb) {
		for (Object item : locationBreadcrumb) {
			if (item instanceof RepeatInstruction) {
				return new Integer(String.valueOf(((RepeatInstruction) item)
						.getValue()));
			}
		}
		return null;
	}

}
