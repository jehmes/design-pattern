package br.com.cod3r.abstractfactory.example3;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.example3.factory.CarAbstractFactory;
import br.com.cod3r.abstractfactory.example3.factory.ServiceAbstractFactory;
import br.com.cod3r.abstractfactory.example3.factory.UserAbstractFactory;
import br.com.cod3r.abstractfactory.example3.service.*;

public class Client {

	public static void main(String[] args) {
		ServiceAbstractFactory userFactory = new UserAbstractFactory();
		UserServiceEJB userEjbService = (UserServiceEJB) userFactory.getEJBService();
		UserServiceRest userRestService = (UserServiceRest) userFactory.getRestService();

		userEjbService.save("Jehmes");
		userEjbService.update("Jehmes");
		userRestService.save("Thales");
		userRestService.update("Thales");

		System.out.println("\n=======================================================\n");

		ServiceAbstractFactory carFactory = new CarAbstractFactory();
		CarServiceEJB carServiceEJB = (CarServiceEJB) carFactory.getEJBService();
		CarServiceRest carServiceRest = (CarServiceRest) carFactory.getRestService();

		carServiceEJB.save("Fusca");
		carServiceEJB.delete("Fusca");
		carServiceRest.save("Palio");
		carServiceRest.delete("Palio");
	}
}
