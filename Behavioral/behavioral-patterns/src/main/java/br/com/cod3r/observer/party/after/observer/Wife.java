package br.com.cod3r.observer.party.after.observer;

public class Wife implements Observer {

    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Get Ready...");
            System.out.println("Surprise!!");
        } else
            System.out.println("Hold on!");
    }
}
