package br.com.cod3r.observer.party.after.subject;

import br.com.cod3r.observer.party.after.observer.Observer;

public class Doorman extends Subject {

    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
