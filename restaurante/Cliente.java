package restaurante;

public class Cliente {
	
	private int dni;
	private  String name;
	private int numberPhone;
	
	//CONSTRUCTOR
	
	public Cliente(int dni, String name, int numberPhone) {
		this.dni = dni;
		this.name = name;
		this.numberPhone = numberPhone;
	}

	// GETTER & SETTER

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}
	
	
	
	
	
}
