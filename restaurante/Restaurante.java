package restaurante;

import java.util.ArrayList;

public class Restaurante {

	private int id;
	private String name;
	private ArrayList<Encargo> orderList = new ArrayList<>();
	private ArrayList<Producto> productListRestaurante = new ArrayList<>();

	// CONSTRUCTOR

	public Restaurante(int id, String name) {
		this.id = id;
		this.name = name;

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

	public ArrayList<Encargo> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Encargo> orderList) {
		this.orderList = orderList;
	}

	public ArrayList<Producto> getProductList() {
		return productListRestaurante;
	}

	public void setProductList(ArrayList<Producto> productList) {
		this.productListRestaurante = productList;
	}

	// METODO ADD PRODUCTOS

	public void addProducto(Producto producto) {

		productListRestaurante.add(producto);

	}

	// METODO ADD PEDIDOS

	public void addEncargo(Encargo encargo) {

		orderList.add(encargo);

	}

	// MOSTRAR CARTA

	public void showMenu() {

		for (int i = 0; i < productListRestaurante.size(); i++) {

			System.out.println(" [ " + i + " ] " + productListRestaurante.get(i).getName() + " - "
					+ productListRestaurante.get(i).getPrice() + " euros.");
			System.out.println(
					" Tiempo de preparacion: " + productListRestaurante.get(i).getTimeCooking() + " minutos. \n");

		}

	}

	public void showOrder() {

		for (int i = 0; i < orderList.size(); i++) {

			System.out.println(" [ " + orderList.get(i).getId() + " ] " + orderList.get(i).getAddress().getLocation()
					+ " - " + orderList.get(i).getAddress().getStreet() + " - "
					+ orderList.get(i).getCliente().getName());

		}

	}

}
