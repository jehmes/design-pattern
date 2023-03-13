package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.Database;
import br.com.cod3r.bridge.mvc.model.User;

public class UserSoap extends Services {

	public UserSoap(Database database) {
		super(database);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
		database.save(user);
	}
}
