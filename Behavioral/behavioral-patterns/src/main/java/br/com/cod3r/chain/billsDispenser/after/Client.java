package br.com.cod3r.chain.billsDispenser.after;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		atm.withDraw(230);
		System.out.println("-----------");
		atm.withDraw(66);

		System.out.println("------------------------------------------");

		Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128), new Bill(64)
				, new Bill(32), new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
		System.out.println("Withdrawing $230...");
		customDispenser.withDraw(230);
		System.out.println("-----------");
		System.out.println("Withdrawing $1589...");
		customDispenser.withDraw(1589);
	}
}
