package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
//		IPhone iPhone = new IPhoneFactory("X", "standard");
		IPhone iPhoneX = IPhoneFactory.create("X", "standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
	}
}
