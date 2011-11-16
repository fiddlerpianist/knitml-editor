package com.knitml.dsl.ui.folding;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldedPosition;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.ITextRegion;

/**
 * Copied from {@link DefaultFoldingRegionAcceptor} but fixed where indicated.
 */
public class KnittingExpressionLanguageFoldingRegionAcceptor implements IFoldingRegionAcceptor<ITextRegion> {
	
	static final int UNSET = -1;

	private static final Logger log = Logger.getLogger(DefaultFoldingRegionAcceptor.class);
	private Collection<FoldedPosition> result;
	private IXtextDocument xtextDocument;

	public KnittingExpressionLanguageFoldingRegionAcceptor(IXtextDocument document, Collection<FoldedPosition> result) {
		this.result = result;
		this.xtextDocument = document;
	}

	public void accept(int offset, int length, ITextRegion significantRegion) {
		IRegion position = getLineRegion(offset, length);
		FoldedPosition foldingRegion = newFoldedPosition(position, significantRegion);
		if (foldingRegion != null) {
			result.add(foldingRegion);
		}
	}
	
	public void accept(int offset, int length) {
		accept(offset, length, null);
	}

	protected IRegion getLineRegion(int offset, int length) {
		IRegion position = null;
		try {
			int startLine = xtextDocument.getLineOfOffset(offset);
			// JW: substracted 1 because line folding was a bit too greedy  
			int endLine = xtextDocument.getLineOfOffset(offset + length) - 1;
			if (startLine < endLine) {
				int start = xtextDocument.getLineOffset(startLine);
				int end = xtextDocument.getLineOffset(endLine) + xtextDocument.getLineLength(endLine);
				position = new Region(start, end - start);
			}
		} catch (BadLocationException e) {
			if (log.isInfoEnabled())
				log.info(e.getMessage(), e);
		}
		return position;
	}

	protected FoldedPosition newFoldedPosition(IRegion region, ITextRegion significantRegion) {
		if (region == null)
			return null;
		// JW: added region to significantRegion comparison and returns UNSET label for folded position when true  
		if (significantRegion != null && region.getOffset() == significantRegion.getOffset() && region.getLength() == significantRegion.getLength())
			return new DefaultFoldedPosition(region.getOffset(), region.getLength(), significantRegion.getOffset() - region.getOffset(), significantRegion.getLength());
		return new DefaultFoldedPosition(region.getOffset(), region.getLength(), UNSET, UNSET);
	}

}
