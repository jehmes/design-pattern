package br.com.cod3r.state.headphone.after.state;

import br.com.cod3r.state.headphone.after.model.HeadPhone;

public class OnState implements State {
    @Override
    public void click(HeadPhone headPhone) {
        System.out.println("Playing song");
        headPhone.setState(new PlayingState());
        headPhone.setPlaying(true);
    }

    @Override
    public void longclick(HeadPhone headPhone) {
        System.out.println("Turning off your headphone");
        headPhone.setState(new OffState());
        headPhone.setOn(false);
        headPhone.setPlaying(false);
    }
}
