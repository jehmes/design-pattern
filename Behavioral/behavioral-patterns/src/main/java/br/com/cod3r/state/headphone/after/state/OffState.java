package br.com.cod3r.state.headphone.after.state;

import br.com.cod3r.state.headphone.after.model.HeadPhone;

public class OffState implements State {
    @Override
    public void click(HeadPhone headPhone) {
        System.out.println("Can't do it, Please turn on your headphone");
    }

    @Override
    public void longclick(HeadPhone headPhone) {
        System.out.println("Turning on your headphone");
        headPhone.setState(new OnState());
        headPhone.setOn(true);
    }
}
