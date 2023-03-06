package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;

public abstract class IPhoneFactory {

	private IPhone device;

	public IPhone generate() {
		device = create();
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone create();
}
