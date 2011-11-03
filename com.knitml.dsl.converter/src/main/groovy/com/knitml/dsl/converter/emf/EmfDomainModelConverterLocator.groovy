package com.knitml.dsl.converter.emf;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.knitml.core.converter.DomainModelConverter;
import com.knitml.core.converter.DomainModelConverterLocator;
import com.knitml.dsl.converter.emf.exception.ConverterNotFoundException;

public class EmfDomainModelConverterLocator implements
		DomainModelConverterLocator<EObject> {
	
	@Inject
	protected Injector injector; 

	@Override
	public DomainModelConverter<EObject> locateConverter(
			EObject sourceModel) {
		// iterate through each interface this object implements
		for (Class<?> interf : sourceModel.class.interfaces) {
			if (interf.package.name.equals("com.knitml.dsl.knittingExpressionLanguage")) {
				try {
					Class<DomainModelConverter<EObject>> converterClass = (Class<DomainModelConverter<EObject>>) Class
							.forName(this.class.package.name
									+ "." + interf.getSimpleName()
									+ "Converter");
					if (!DomainModelConverter.class
							.isAssignableFrom(converterClass)) {
						throw new ConverterNotFoundException("Could not find a converter for type " + interf.name);
					}
					DomainModelConverter<EObject> converter = converterClass.newInstance();
					injector.injectMembers(converter);
					return converter;
				} catch (Exception ex) {
					throw new ConverterNotFoundException(ex);
				}
			}
		}
		throw new ConverterNotFoundException("Could not find an appropriate interface to convert " + sourceModel.class.name);
	}
}
