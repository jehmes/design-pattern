package br.com.cod3r.observer.party.after;


import br.com.cod3r.observer.party.after.observer.Friend;
import br.com.cod3r.observer.party.after.observer.Observer;
import br.com.cod3r.observer.party.after.observer.Wife;
import br.com.cod3r.observer.party.after.subject.Doorman;
import br.com.cod3r.observer.party.after.subject.Subject;

public class Client {

	public static void main(String[] args) {
		Observer wife = new Wife();
		Observer friend = new Friend();

		Doorman reception = new Doorman();

		reception.addObserver(wife);
		reception.addObserver(friend);

		reception.setStatus(true);

		reception.notifyObservers(reception.getStatus());
	}
}
