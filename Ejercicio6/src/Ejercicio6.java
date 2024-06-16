import java.util.Scanner;

public class Ejercicio6 {
	
	private static Campania campania = new Campania("Campania Prueba");

	public static String pedirNombre(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		
		System.out.println(mensaje);
		nombre = entrada.nextLine();
		
		return nombre;
	}
	
	public static int pedirImporte(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		int donacion;
		
		System.out.println(mensaje);
		donacion = entrada.nextInt();
		
		return donacion;
	}
	
	public static void añadirDonacion() {
		Donacion donacion;
		String nombre;
		int importe;
		
		nombre = pedirNombre("Nombre donante: ");
		importe = pedirImporte("importe ");
		
		donacion = new Donacion(nombre,importe);
		
		campania.insertarDonaciones(donacion);
	}
	public static void mostrarPorNombre() {
		String nombre;
		nombre = pedirNombre("Donante que quieres buscar: ");
		
		campania.mostarPorNombre(nombre);
	}
	
	
	public static void menu() {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println("-----------MENU-----------");
			System.out.println("1- Añadir donacion");
			System.out.println("2- Mostrar donaciones");
			System.out.println("3- Mostar donaciones por nombre de donante");
			System.out.println("4- Mostrar numero de donaciones");
			System.out.println("5- Mostrar total de dinero recaudado");
			System.out.println("6- Ordenar donaciones");
			System.out.println("7- Salir");
			System.out.print("      Opcion:");
			num = entrada.nextInt();
			
			switch(num) {
			case 1:
				añadirDonacion();
				break;
			case 2:
				campania.mostrarDatos();
				break;
			case 3:
				mostrarPorNombre();
				break;
			case 4:
				campania.getNumDonaciones();
				break;
			case 5:
				System.out.println("Total es: " + campania.calcularDinero() + "€");
				break;
			case 6:
				campania.ordenarDonaciones();
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			}
			
		}while(num!=7);
	}
	
	public static void main(String[] args) {
		menu();
	}

}
