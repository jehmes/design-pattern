package br.com.cod3r.state.headphone.after.state;

import br.com.cod3r.state.headphone.after.model.HeadPhone;

public interface State {
    void click(HeadPhone headPhone);
    void longclick(HeadPhone headPhone);
}
