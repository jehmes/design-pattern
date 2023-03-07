package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public abstract class IPhoneFactory {
	/*FORMA 1 - SEM CONSTRUTOR NA SUPER CLASSE
	* AS SUB CLASSES PRECISAM TER A VARIAVEL rules
	* PARA PODER INJETAR EM SEUS PRODUTOS, POR EXEMPLO
	* new IPhone11(rules)*/

	/*FORMA 2 - COM CONSTRUTOR NA SUPER CLASSE*/
		CountryRulesAbstractFactory rules;

	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}


	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
