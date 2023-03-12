package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.*;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    public IPhone create(String level) {
        IPhone iPhone;
        if (("standard").equals(level)) {
            iPhone = new IPhone11();
        } else {
            iPhone = new IPhone11Pro();
        }

        return iPhone;
    }
}
