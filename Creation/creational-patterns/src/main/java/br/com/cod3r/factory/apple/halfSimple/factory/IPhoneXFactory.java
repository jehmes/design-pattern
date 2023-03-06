package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    public IPhone create(String level) {
        IPhone iPhone;
        if (("standard").equals(level)) {
            iPhone = new IPhoneX();
        } else {
            iPhone = new IPhoneXSMax();
        }

        return iPhone;
    }
}
