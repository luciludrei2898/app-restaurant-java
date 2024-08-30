package restaurante;

public class Producto {
	
	private int id;
	private String name;
	private double price;
	private int timeCooking;
	
	//CONSTRUCTOR
	
	public Producto(int id, String name, double price, int timeCooking) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.timeCooking = timeCooking;
	}
	
	// GETTER & SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTimeCooking() {
		return timeCooking;
	}

	public void setTimeCooking(int timeCooking) {
		this.timeCooking = timeCooking;
	}
	
	

}
