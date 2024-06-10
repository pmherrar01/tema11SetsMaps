import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Ejercicio2 {

	public static int pedirClave() {
		Scanner entrada = new Scanner(System.in);
		int clave;

		System.out.println("Id del producto: ");
		clave = entrada.nextInt();

		return clave;
	}

	public static Producto pedirDatos() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		String nombre;
		float precio;
		int stock;

		System.out.println("Nombre del producto: ");
		nombre = entrada.nextLine();
		System.out.println("precio:");
		precio = entrada1.nextFloat();
		System.out.println("Stock:");
		stock = entrada2.nextInt();

		Producto producto = new Producto(nombre, precio, stock);

		return producto;
	}

	public static void introducirProductosLista(Map mapa) {
		Producto producto;
		int clave;

		clave=pedirClave();
		producto = pedirDatos();

		mapa.put(clave, producto);
	}

	public static void mostrarProductos(Map mapa) {
		Producto producto;
		int clave;

		Iterator it = mapa.keySet().iterator();
		while(it.hasNext()) {
			clave = (int) it.next();
			producto = (Producto) mapa.get(clave);
			System.out.println(producto.toString());
		}
	}

	public static void borarProducto(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);

		int codigo;

		System.out.print("Borar producto");
		System.out.print("Id del producto: ");

		codigo = entrada.nextInt();

		if(mapa.containsKey(codigo)) {
			mapa.remove(codigo);
			System.out.print("Producto borrado...");
		}else {
			System.out.print("El producto con codigo:" + codigo + "no a sido encontrado.");
		}
	}

	public static int elegirProducto(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int clave, codigo;
		Producto producto;
		Iterator it = mapa.keySet().iterator();

		while(it.hasNext()) {
			clave = (int) it.next();
			producto = (Producto) mapa.get(clave);
			System.out.println("Pulse " + clave + "para comprar " + producto.getNombreProducto());
		}
		System.out.print("Opcion:    ");
		codigo = entrada.nextInt();
		return codigo;
	}
	
	public static void comprarProductos() {
		
	}

	public static void menuCompra(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU ADMINISTRACION--------");
			System.out.println("1- Introducir productos en la lista.");
			System.out.println("2- Visualizar productos");
			System.out.println("3- Eliminar productos de la la lista");
			System.out.println("5- Volver al menu principal");
			System.out.print("        Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				introducirProductosLista(mapa);
				break;
			case 2:
				mostrarProductos(mapa);
				break;
			case 3:
				borarProducto(mapa);
				break;
			case 4:
				System.out.println("Volviendo al menu principal");
				menu(mapa);
				break;
			}
		}while(num!=3);
	}

	public static void menuAdministracion(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU ADMINISTRACION--------");
			System.out.println("1- Introducir productos en la lista.");
			System.out.println("2- Visualizar productos");
			System.out.println("3- Eliminar productos de la la lista");
			System.out.println("4- Volver al menu principal");
			System.out.print("        Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				introducirProductosLista(mapa);
				break;
			case 2:
				mostrarProductos(mapa);
				break;
			case 3:
				borarProducto(mapa);
				break;
			case 4:
				System.out.println("Volviendo al menu principal");
				menu(mapa);
				break;
			}
		}while(num!=4);
	}

	public static void menu(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU--------");
			System.out.println("1- MENU DE ADMINISTRACION.");
			System.out.println("2- MENU DE COMPRA");
			System.out.println("3- SALIR");
			System.out.print("        Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				menuAdministracion(mapa);
				break;
			case 2:
				menuCompra(mapa);
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=3);
	}

	public static void main(String[] args) {

		Map<Integer,Producto> mapa = new HashMap<>();
		menu(mapa);
	}

}
