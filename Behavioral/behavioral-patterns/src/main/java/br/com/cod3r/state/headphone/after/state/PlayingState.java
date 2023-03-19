package br.com.cod3r.state.headphone.after.state;

import br.com.cod3r.state.headphone.after.model.HeadPhone;

public class PlayingState implements State {
    @Override
    public void click(HeadPhone headPhone) {
        System.out.println("Stopped song");
        headPhone.setState(new OnState());
        headPhone.setPlaying(false);
    }

    @Override
    public void longclick(HeadPhone headPhone) {
        System.out.println("Turning off your headphone");
        headPhone.setState(new OffState());
        headPhone.setOn(false);
        headPhone.setPlaying(false);
    }
}
