package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    public IPhone create() {
        return new IPhoneX();
    }
}
