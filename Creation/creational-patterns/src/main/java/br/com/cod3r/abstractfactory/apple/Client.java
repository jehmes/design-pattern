package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();

		IPhoneFactory iPhoneFactory11 = new IPhone11Factory(brazilianRules);
		IPhone iPHone11 = iPhoneFactory11.orderIPhone("standard");
		System.out.println("\n==============================================\n");

		IPhoneFactory iPhoneFactoryX = new IPhoneXFactory(usRules);
		IPhone iPhonex = iPhoneFactoryX.orderIPhone("highEnd");
	}
}
