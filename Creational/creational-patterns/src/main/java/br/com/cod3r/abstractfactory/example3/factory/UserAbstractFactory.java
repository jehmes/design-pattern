package br.com.cod3r.abstractfactory.example3.factory;

import br.com.cod3r.abstractfactory.example3.service.UserService;
import br.com.cod3r.abstractfactory.example3.service.UserServiceEJB;
import br.com.cod3r.abstractfactory.example3.service.UserServiceRest;

public class UserAbstractFactory implements ServiceAbstractFactory {
    @Override
    public UserService getEJBService() {
        return new UserServiceEJB();
    }

    @Override
    public UserService getRestService() {
        return new UserServiceRest();
    }
}
