package com.knitml.dsl.ui.folding;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

import com.google.common.collect.Lists;
import com.knitml.dsl.knittingExpressionLanguage.Section;

/**
 * @author Peter Friese - Implementation
 * @author Sven Efftinge - Initial contribution and API
 */
public class KnittingExpressionLanguageLocationInFileProvider extends
		DefaultLocationInFileProvider {

	protected List<INode> getLocationNodes(EObject obj) {
		if (obj instanceof Section && ((Section) obj).getElements() != null
				&& ((Section) obj).getElements().size() > 0) {
			List<INode> resultNodes = Lists.newArrayList();
			EObject firstSemanticChild = ((Section) obj).getElements().get(0);
			resultNodes.add(NodeModelUtils.getNode(firstSemanticChild));
			return resultNodes;
		} else {
			return super.getLocationNodes(obj);
		}
	}
}
