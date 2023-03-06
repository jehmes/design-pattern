package br.com.cod3r.factory.apple.halfSimple.factory;


import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {
	private String name;
	public IPhone generate(String level) {
		IPhone iPhone = create(level);
		iPhone.getHardware();
		iPhone.assemble();
		iPhone.certificates();
		iPhone.pack();

		return iPhone;
	}
	protected abstract IPhone create(String level);
}
