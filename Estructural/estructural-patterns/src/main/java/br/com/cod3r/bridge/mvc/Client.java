package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.Database;
import br.com.cod3r.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.Services;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		Services ejb = new UserEJB(new UserOracleDao());
		ejb.save(user);

		System.out.println("====================================================");

		Services rest = new UserRest(new UserMongoDao());
		rest.save(user);

		System.out.println("====================================================");

		Services soap = new UserSoap(new UserPostgresDao());
		soap.save(user);
	}
}
