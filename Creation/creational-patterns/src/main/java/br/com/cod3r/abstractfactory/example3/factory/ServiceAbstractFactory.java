package br.com.cod3r.abstractfactory.example3.factory;

import br.com.cod3r.abstractfactory.example3.service.Service;

public interface ServiceAbstractFactory {
    Service getEJBService();
    Service getRestService();
}
