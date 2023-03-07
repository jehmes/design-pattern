package br.com.cod3r.abstractfactory.example4;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;
import br.com.cod3r.abstractfactory.example4.factory.CardPaymentServiceFactory;
import br.com.cod3r.abstractfactory.example4.factory.IPaymentServiceFactory;
import br.com.cod3r.abstractfactory.example4.factory.PixPaymentServiceFactory;
import br.com.cod3r.abstractfactory.example4.model.IPayment;
import br.com.cod3r.abstractfactory.example4.service.IPaymentService;

public class Client {

	public static void main(String[] args) {

		IPaymentServiceFactory cardPaymentServiceFactory = new CardPaymentServiceFactory();
		IPayment cardPaymentService = cardPaymentServiceFactory.create();
		System.out.println(cardPaymentService);

		IPaymentServiceFactory pixPaymentServiceFactory = new PixPaymentServiceFactory();
		IPayment pixPaymentService = pixPaymentServiceFactory.create();
		System.out.println(pixPaymentService);

	}
}
