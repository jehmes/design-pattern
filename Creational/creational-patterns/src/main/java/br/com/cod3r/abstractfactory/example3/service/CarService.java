package br.com.cod3r.abstractfactory.example3.service;

public abstract class CarService implements Service{
    abstract void save(String name);
    abstract void delete(String name);
}
