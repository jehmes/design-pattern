package br.com.cod3r.prototype.deepShallow;

import br.com.cod3r.prototype.deepShallow.model.Address;
import br.com.cod3r.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Thales", 27, new Address("Rua 1", 42));
		System.out.println(user);

		User cloneUser = user.clone();
		cloneUser.name = "Jehmes";
		cloneUser.address.street = "Rua 434";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}