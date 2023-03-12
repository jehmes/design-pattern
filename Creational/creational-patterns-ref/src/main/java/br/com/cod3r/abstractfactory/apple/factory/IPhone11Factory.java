package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    /*FORMA 1 - COM CONSTRUTOR NA SUB CLASSE
     * NESSA FORMA, A SUPER CLASSE NÃO PRECISA DA VARIAVEL rules,
     * MAS SUAS SUBCLASSES PRECISAM TER
     */
//	CountryRulesAbstractFactory rules;
//
//	public IPhone11Factory(CountryRulesAbstractFactory rules) {
//		this.rules = rules;
//	}

    /*FORMA 2 - COM CONSTRUTOR NA SUB CLASSE MAS COM O METODO SUPER
     * NESSA FORMA, A SUPER CLASSE DETEM A VARIAVEL rules ONDE AS
     * SUB CLASSES COMPARTILHAM, SEM PRECISAR COLOCAR A VARIAVEL rules
     * EM CADA SUB CLASSE FACTORY
     */
    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11(rules);
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else return null;
    }

}
