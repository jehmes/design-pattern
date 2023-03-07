package br.com.cod3r.factory.example4;

import br.com.cod3r.factory.example4.factory.CardPaymentServiceFactory;
import br.com.cod3r.factory.example4.factory.IPaymentServiceFactory;
import br.com.cod3r.factory.example4.factory.PixPaymentServiceFactory;
import br.com.cod3r.factory.example4.model.IPayment;

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
