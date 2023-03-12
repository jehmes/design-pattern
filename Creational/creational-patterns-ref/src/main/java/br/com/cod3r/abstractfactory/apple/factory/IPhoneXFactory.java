package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    /*FORMA 1 - COM CONSTRUTOR NA SUB CLASSE
     * NESSA FORMA, A SUPER CLASSE NÃO PRECISA DA VARIAVEL rules,
     * MAS SUAS SUBCLASSES PRECISAM TER
     */
//	CountryRulesAbstractFactory rules;
//
//	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
//		this.rules = rules;
//	}

    /*FORMA 2 - COM CONSTRUTOR NA SUB CLASSE MAS COM O METODO SUPER
     * NESSA FORMA, A SUPER CLASSE DETEM A VARIAVEL rules ONDE AS
     * SUB CLASSES COMPARTILHAM, SEM PRECISAR COLOCAR A VARIAVEL rules
     * EM CADA SUB CLASSE FACTORY
     * */
    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(rules);
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }

}
