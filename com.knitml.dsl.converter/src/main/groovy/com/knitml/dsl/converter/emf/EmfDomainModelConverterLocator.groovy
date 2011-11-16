package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.dsl.converter.emf.exception.ConverterNotFoundException

@Singleton
public class EmfDomainModelConverterLocator implements
DomainModelConverterLocator<EObject> {

	@Inject
	protected Injector injector
	
	private Map converters = [:]

	public findConverter(Class interf) {
		String targetName = this.class.package.name + "." + interf.simpleName + "Converter"
		if (converters.get(targetName) != null) {
			return converters.get(targetName)
		}
		try {
			def converterClass = this.class.classLoader.loadClass(targetName)
			if (!DomainModelConverter.class.isAssignableFrom(converterClass)) {
				throw new ConverterNotFoundException("Could not find a converter for type " + interf.name)
			}
			def converter = converterClass.newInstance()
			injector.injectMembers(converter)
			converters.put(targetName, converter)
			return converter
		} catch (Exception ex) {
			throw new ConverterNotFoundException(ex);
		}
	}

	@Override
	public DomainModelConverter<EObject> locateConverter(EObject sourceModel) {
		// iterate through each interface this object implements
		for (Class<?> interfaceName : sourceModel.class.interfaces) {
			if (interfaceName.package.name.equals("com.knitml.dsl.knittingExpressionLanguage")) {
				return findConverter (interfaceName)
			}
		}
		throw new ConverterNotFoundException("Could not find an appropriate interface to convert " + sourceModel.class.name);
	}
}
