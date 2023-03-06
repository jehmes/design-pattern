package br.com.cod3r.abstractfactory.example3.service;

public class UserServiceEJB extends UserService {
    @Override
    public void save(String name) {
        System.out.println(name + " user was saved using EJB");
    }

    @Override
    public void update(String name) {
        System.out.println(name + " user was updated using EJB");
    }
}
