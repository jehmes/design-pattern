package br.com.cod3r.chain.validation;


import br.com.cod3r.chain.validation.steps.BuildProcessStep;
import br.com.cod3r.chain.validation.steps.ProcessStep;

public class Client {

	public static void main(String[] args) {

		ProcessStep createdChain = BuildProcessStep.createChain;
		double finalPrice = createdChain.applyDiscount(1200);
		System.out.println("Final price is " + finalPrice);
	}
}
