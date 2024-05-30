import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Ejercicio2 {

	public static void menu(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("-------MENU-------");
			System.out.println("1- Menu de administracion");
			System.out.println("2- Menu de compra");
			System.out.println("3- SAlir");
			System.out.println("     Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
		}while(num!=3);
	}

	public static Producto pedirProducto() {
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoI = new Scanner(System.in);
		Scanner tecladoF = new Scanner(System.in);

		Producto producto;
		String nombre;
		float precio;
		int stock;

		System.out.println("Nuevo Producto ");
		System.out.print("Nombre: ");
		nombre = tecladoS.nextLine();
		System.out.print("Precio: ");
		precio = tecladoF.nextFloat();
		System.out.print("Stock: ");
		stock = tecladoI.nextInt();

		producto = new Producto(nombre, precio, stock);

		return producto;
	}

	public static void introducirProductos(Map mapa, Producto nuevoProducto) {
		for (Producto producto : mapa.size()) {
			
		}
	}

	public static void menuAdministracion(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("-------MENU ADMINISTRACION-------");
			System.out.println("1- Introducimos productos en la lista");
			System.out.println("2- Visualizar productos");
			System.out.println("3- Eliminar producto");
			System.out.println("4- Volver al menu principal");
			System.out.println("     Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:

				break;
			}
		}while(num!=4);
	}

	public static void main(String[] args) {
		Map<Integer,Producto> mapa = new HashMap<>(); 

	}

}
