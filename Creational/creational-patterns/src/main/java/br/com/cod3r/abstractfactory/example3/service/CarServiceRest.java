package br.com.cod3r.abstractfactory.example3.service;

public class CarServiceRest extends CarService {
    @Override
    public void save(String name) {
        System.out.println(name + " car was saved using Rest");
    }

    @Override
    public void delete(String name) {
        System.out.println(name + " car was deleted using Rest");
    }
}
