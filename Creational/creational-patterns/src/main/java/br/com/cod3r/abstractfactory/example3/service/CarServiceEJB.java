package br.com.cod3r.abstractfactory.example3.service;

public class CarServiceEJB extends CarService {
    @Override
    public void save(String name) {
        System.out.println(name + " car was saved using EJB");
    }

    @Override
    public void delete(String name) {
        System.out.println(name + " car was deleted using EJB");
    }
}
