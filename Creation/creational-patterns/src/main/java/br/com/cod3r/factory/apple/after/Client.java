package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = iphoneXFactory.generate();
		System.out.println(iphoneX);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11Pro  = iphone11ProFactory.generate();
		System.out.println(iphone11Pro);

	}
}
