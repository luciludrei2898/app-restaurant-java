package restaurante;

import java.util.ArrayList;

public class Encargo {
	
	private int id;
	private Direccion address;
	private ArrayList<Producto> productListPedido = new ArrayList<>();
	private double totalPrice;
	private Cliente cliente;
	
	//CONSTRUCTOR
	
	public Encargo(int id, Direccion address, Cliente cliente) {
		this.id = id;
		this.address = address;
		this.cliente = cliente;
	}
	
	// GETTER & SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Direccion getAddress() {
		return address;
	}
	
	// METODO ADD DIRECCION

	public void setAddress(Direccion address) {
		this.address = address;
	}

	public ArrayList<Producto> getProductList() {
		return productListPedido;
	}

	public void setProductList(ArrayList<Producto> productList) {
		this.productListPedido = productList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	// METODO ADD OBJETO CLIENTE

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	// CALCULAR PRECIO TOTAL 
	
	public void showTotalPrice() {
		
	
		double totalPrice = 0;
		
		for (int i = 0; i < productListPedido.size(); i++) {
			
			totalPrice += productListPedido.get(i).getPrice();
			
		}
		
		System.out.println(" PRECIO TOTAL DEL PEDIDO: " + totalPrice + " euros. ");
		
	}
	
}
