package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.Database;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class Services {

    Database database;

    public Services(Database database) {
        this.database = database;
    }

    public abstract void save(User user);
}
