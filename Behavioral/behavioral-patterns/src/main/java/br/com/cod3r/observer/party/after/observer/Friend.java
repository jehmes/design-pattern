package br.com.cod3r.observer.party.after.observer;

public class Friend implements Observer {
    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Here is your present!");
        } else {
            System.out.println("Ok, Im waiting");
        }
    }
}
