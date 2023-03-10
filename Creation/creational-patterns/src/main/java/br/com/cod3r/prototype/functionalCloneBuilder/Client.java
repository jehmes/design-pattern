package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User.Builder().withName("jehmes").withAdress(new Address("Rua 1", 2)).build();
		System.out.println(user);

		System.out.println(user);
		User userClone = user.cloneBuilder().withAge(27).withAdress(new Address("Rua F. Sertão", 7)).build();
		userClone = userClone.cloneBuilder().withName("Thales").build();
		System.out.println(userClone);

	}
}