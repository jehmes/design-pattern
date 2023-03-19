package br.com.cod3r.state.headphone.after;


import br.com.cod3r.state.headphone.after.model.HeadPhone;

public class Client {

	public static void main(String[] args) {
		HeadPhone headPhone = new HeadPhone();

		headPhone.onClick();
		headPhone.onLongClick();
		headPhone.onClick();
		headPhone.onClick();
		headPhone.onClick();
		headPhone.onLongClick();
		headPhone.onClick();
	}
}
