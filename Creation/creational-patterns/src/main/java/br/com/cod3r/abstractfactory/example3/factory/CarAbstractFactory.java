package br.com.cod3r.abstractfactory.example3.factory;

import br.com.cod3r.abstractfactory.example3.service.CarService;
import br.com.cod3r.abstractfactory.example3.service.CarServiceEJB;
import br.com.cod3r.abstractfactory.example3.service.CarServiceRest;

public class CarAbstractFactory implements ServiceAbstractFactory {
    @Override
    public CarService getEJBService() {
        return new CarServiceEJB();
    }

    @Override
    public CarService getRestService() {
        return new CarServiceRest();
    }
}
