package br.com.cod3r.state.headphone.after.model;

import br.com.cod3r.state.headphone.after.state.OffState;
import br.com.cod3r.state.headphone.after.state.State;

public class HeadPhone {
	private State state;
	private boolean isOn;
	private boolean isPlaying;

	public HeadPhone() {
		this.state = new OffState();
		this.isOn = false;
		this.isPlaying = false;
	}

	public void onClick() {
		System.out.println("> Click");
		state.click(this);
	}

	public void onLongClick() {
		System.out.println("> Long click");
		state.longclick(this);
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean on) {
		isOn = on;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean playing) {
		isPlaying = playing;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
