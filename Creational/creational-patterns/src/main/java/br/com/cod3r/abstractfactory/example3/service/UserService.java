package br.com.cod3r.abstractfactory.example3.service;

public abstract class UserService implements Service{
    abstract void save(String name);
    abstract void update(String name);
}
