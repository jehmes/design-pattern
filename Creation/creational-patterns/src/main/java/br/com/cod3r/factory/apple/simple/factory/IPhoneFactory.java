package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.*;

public class IPhoneFactory {

    public static IPhone create(String generation, String level) {
        IPhone iPhone;

        if (("X").equals(generation)) {
            if (("standard").equals(level)) {
                iPhone = new IPhoneX();
            } else {
                iPhone = new IPhoneXSMax();
            }
        } else {
            if (("standard").equals(level)) {
                iPhone = new IPhone11();
            } else {
                iPhone = new IPhone11Pro();
            }
        }
        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }
	
}
