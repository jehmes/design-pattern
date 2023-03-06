package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		ServicesAbstractFactory ejbAbstractFactory = new EJBAbstractFactory();

		CarService carEJBService = ejbAbstractFactory.getCarService();
		carEJBService.save("Kwid");
		carEJBService.update("Kwid");

		UserService userService = ejbAbstractFactory.getUserService();
		userService.save("Thales");
		userService.delete(1);

		System.out.println("\n=======================================================\n");

		ServicesAbstractFactory restAbstractFactory = new RestAbstractFactory();
		CarService carRestService = restAbstractFactory.getCarService();
		carRestService.save("Argus");
		carRestService.update("Argus");

		UserService userRestService = restAbstractFactory.getUserService();
		userRestService.save("Jehmes");
		userRestService.delete(2);

	}
}
