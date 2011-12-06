package com.knitml.dsl.ui.folding;

import java.util.Collection;

import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldedPosition;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.ITextRegion;

/**
 * Copied from {@link DefaultFoldingRegionAcceptor} but fixed where indicated.
 */
public class KnittingExpressionLanguageFoldingRegionAcceptor extends DefaultFoldingRegionAcceptor {
	
	static final int UNSET = -1;

	public KnittingExpressionLanguageFoldingRegionAcceptor(IXtextDocument document, Collection<FoldedPosition> result) {
		super(document, result);
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
