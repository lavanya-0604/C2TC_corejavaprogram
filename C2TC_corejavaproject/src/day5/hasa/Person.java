package day5.hasa;

//Container class
public class Person {

	private String name;
	private Address address;//address in Address class(class_name instance_variable)

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// Getter and setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()
				+ " " + address.getPostalCode());//no toString because there is no extends..
	}
}
