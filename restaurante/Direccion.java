package restaurante;

public class Direccion {

	private String location;
	private String street;
	private int numberStreet;
	private int numberFloor;
	private String charHouse;
	
	//CONSTRUCTOR
	
	public Direccion(String location, String street, int numberStreet, int numberFloor, String charHouse) {
		this.location = location;
		this.street = street;
		this.numberStreet = numberStreet;
		this.numberFloor = numberFloor;
		this.charHouse = charHouse;
	}
	
	// GETTER & SETTER

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumberStreet() {
		return numberStreet;
	}

	public void setNumberStreet(int numberStreet) {
		this.numberStreet = numberStreet;
	}

	public int getNumberFloor() {
		return numberFloor;
	}

	public void setNumberFloor(int numberFloor) {
		this.numberFloor = numberFloor;
	}

	public String getCharHouse() {
		return charHouse;
	}

	public void setCharHouse(String charHouse) {
		this.charHouse = charHouse;
	}
	
	
	
	
}
