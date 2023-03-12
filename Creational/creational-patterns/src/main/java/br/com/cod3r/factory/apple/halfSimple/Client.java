package br.com.cod3r.factory.apple.halfSimple;


import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iPhoneXFactory.generate("standard");


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11 = iPhone11Factory.generate("high end");


		IPhoneFactory iPhoneFactory = new IPhoneXFactory();
	}
}
