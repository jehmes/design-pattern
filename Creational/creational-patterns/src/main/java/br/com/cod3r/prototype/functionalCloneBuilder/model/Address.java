package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable{
	private String street;
	private Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
