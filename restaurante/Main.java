package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// OBJETO SCANNER

		Scanner sc = new Scanner(System.in);

		// CREAMOS LOS PRODUCTOS

		Producto gyozaPollo = new Producto(1, "Gyoza de Pollo", 6.10, 20);
		Producto nigiriSalmon = new Producto(2, "Nigiri de salmon", 2.50, 5);
		Producto makiAguacate = new Producto(3, "Maki de aguacate", 4, 5);
		Producto arrozFrito = new Producto(4, "Arroz frito con huevo", 6.00, 10);
		Producto baoDeSalmon = new Producto(5, "Bao de salmon", 9.00, 15);

		// CREAMOS EL RESTAURANTE, SOLO CON NOMBRE E ID PORQUE LOS ENCARGOS A MEDIDA QUE
		// SE HAGAN SE METERAN EN
		// LA ARRAY LIST

		Restaurante restauranteSumo = new Restaurante(1, "Sumo");

		// ADD LOS PRODUCTOS AL ARRAY LIST DE PRODUCTOS DEL RESTAURANTE

		restauranteSumo.addProducto(gyozaPollo);
		restauranteSumo.addProducto(nigiriSalmon);
		restauranteSumo.addProducto(makiAguacate);
		restauranteSumo.addProducto(arrozFrito);
		restauranteSumo.addProducto(baoDeSalmon);

		// VARIABLES

		int optionOperation = 0; // VARIABLE DE LA OPCION PRINCIPAL DEL MENU
		int optionOperationFinal = 0; // VARIABLE FINAL COMPRA

		boolean flagCompra = false;
		int continueBuy = 0;
		int chosenProduct = 0;

		// VARIABLES DIRECCION

		String location = "";
		String street = "";
		int numberStreet = 0;
		int numberFloor = 0;
		String charHouse = "";

		// VARIABLES CLIENTE

		int dni = 0;
		String name = "";
		int numberPhone = 0;

		// VARIABLES ENCARGO

		int idEncargo = 0;

		do {

			// MENU OPERACION
			System.out.print(
					"\n" + " === SUMO  ===" + "\n" + "\n Seleccione a continuacion la operacion que desea realizar: \n"
							+ "\n" + " \n [1] VER CARTA. \n" + " \n [2] HACER PEDIDO. \n" + " \n [3] VER PEDIDOS. \n"
							+ "\n [4] EXIT. \n" + " \n >>> ");

			optionOperation = sc.nextInt();

			// CONTROL DE ERRORES OPTIONOPERATION

			if (optionOperation == 1 || optionOperation == 2 || optionOperation == 3) {

				// VER CARTA

				if (optionOperation == 1) {

					System.out.println("\n" + " === CARTA DE PRODUCTOS  ===" + "\n");
					restauranteSumo.showMenu();

					// HACER PEDIDO

				} else if (optionOperation == 2) {

					// 1ERO >>> REGISTRAMOS LOS DATOS DE DIRECCION

					System.out.println("\n" + " === REGISTRO DE DATOS DE LA DIRECCION  ===" + "\n");
					System.out.print(" \n Localidad: ");
					location = sc.next();
					System.out.print(" \n Calle: ");
					street = sc.next();
					System.out.print(" \n Numero: ");
					numberStreet = sc.nextInt();
					System.out.print(" \n Numero del piso: ");
					numberFloor = sc.nextInt();
					System.out.print(" \n Letra del piso: ");
					charHouse = sc.next();

					// UNA VEZ RECOGIDOS TODOS LOS DATOS, HACEMOS UN CONSTRUCTOR

					Direccion direccionNueva = new Direccion(location, street, numberStreet, numberFloor, charHouse);

					// 2DO >>>> REGISTRAMOS AL CLIENTE

					System.out.println("\n" + " === REGISTRO DE DATOS DEL CLIENTE  ===" + "\n");
					System.out.print(" \n DNI: ");
					dni = sc.nextInt();
					System.out.print(" \n Nombre: ");
					name = sc.next();
					System.out.print(" \n Numero de telefono: ");
					numberPhone = sc.nextInt();

					// UNA VEZ RECOGIDOS LOS DATOS, HACEMOS EL CONSTRUCTOR DEL CLIENTE

					Cliente clienteNuevo = new Cliente(dni, name, numberPhone);

					// 3ERO >>>> CREAMOS EL ENCARGO SIN LA LISTA DE PRODUCTOS

					// PONEMOS QUE EL ID VAYA INCREMENTANDO DE UNO EN UNO

					idEncargo++;
					ArrayList<Producto> productListPedidoNuevo = new ArrayList<>();

					Encargo encargoNuevo = new Encargo(idEncargo, direccionNueva, clienteNuevo);

					// 4TO >>>> CREAMOS LA LISTA DE ENCARGOS DE PRODUCTOS

					// MOSTRAMOS EL MENU
					System.out.println("\n" + " === CARTA DE PRODUCTOS  ===" + "\n");
					restauranteSumo.showMenu();

					// HACEMOS UN BUCLE QUE PREGUNTE CONSTANTEMENTE QUE QUIERE

					System.out.println("\n" + " === ELECCION DE PRODUCTOS  ===" + "\n");

					flagCompra = false;

					while (flagCompra == false) {

						System.out.print(" \n >>> Introduzca el numero del producto que desea pedir: ");
						chosenProduct = sc.nextInt();

						productListPedidoNuevo.add(restauranteSumo.getProductList().get(chosenProduct));

						System.out.print(" \n ¿Desea seguir comprando? [ 1 ] SI. [ 2 ] NO.  : ");
						continueBuy = sc.nextInt();

						if (continueBuy == 2) {
							flagCompra = true;
						}
					}

					// METEMOS EL PRODUCT LIST EN LOS ENCARGOS

					encargoNuevo.setProductList(productListPedidoNuevo);

					// MOSTRAMOS EL PRECIO FINAL

					encargoNuevo.showTotalPrice();

					System.out.print(" \n ¿DESEA FINALIZAR LA COMPRA? [ 1 ] SI. [ 2 ] NO. :  \n");
					optionOperationFinal = sc.nextInt();

					if (optionOperationFinal == 1) {

						// COMUNICAMOS QUE EL PEDIDO ESTA HECHO CORRECTAMENTE

						System.out.println("\n" + " === PEDIDO REALIZADO, GRACIAS  ===" + "\n");

						// ENVIAMOS EL ENCARGO NUEVO A LA LISTA DE PEDIDOS DEL RESTAURANTE

						restauranteSumo.addEncargo(encargoNuevo);

					} else if (optionOperationFinal == 2) {

						System.out.println(" PEDIDO ANULADO. GRACIAS. ");
					}

					// VER LOS PEDIDOS HECHOS

				} else if (optionOperation == 3) {

					System.out.println();
					restauranteSumo.showOrder();

				}

			} else if (optionOperation < 1 || optionOperation > 4) {
				System.out.println("\n" + "Error de respuesta. Introduzca de nuevo la opcion a realizar.");
			}

		} while (optionOperation != 4);
		{

			System.out.println("\n" + " \n === HASTA PRONTO ===" + "\n"
					+ " \n Muchas gracias por disfrutar de la comida en SUMO. ");

		}

	}

}
