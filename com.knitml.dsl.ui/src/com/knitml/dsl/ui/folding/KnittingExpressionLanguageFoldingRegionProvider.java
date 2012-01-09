package com.knitml.dsl.ui.folding;

import java.util.Collection;

import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.ITextRegion;

public class KnittingExpressionLanguageFoldingRegionProvider extends
		DefaultFoldingRegionProvider {

	@Override
	protected IFoldingRegionAcceptor<ITextRegion> createAcceptor(IXtextDocument xtextDocument, Collection<FoldedPosition> foldedPositions) {
		return new KnittingExpressionLanguageFoldingRegionAcceptor(xtextDocument, foldedPositions);
	}
	
	
}
