package br.com.cod3r.mediator.swing.components;

import br.com.cod3r.mediator.swing.mediator.Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	Mediator mediator;

	public ResetButton(Mediator mediator) {
		super("Reset");
		this.mediator = mediator;

		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.reset();
			}
		});
	}

}
