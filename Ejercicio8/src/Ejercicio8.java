import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio8 {
	
	public static void insertarCiudad(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		String nombreCiudad, respuesta;
		Sede sede;
		Ciudad ciudad;
		
		System.out.println("Nombre ciudad: ");
		nombreCiudad = entrada.nextLine();
		
		ciudad = new Ciudad(nombreCiudad);
		
		ciudad.rellenarSedes();
		lCiudades.add(ciudad);
	}
	
	public static void mostrarCiudades(ArrayList<Ciudad> lCiudades) {
		for(int i = 0; i < lCiudades.size(); i++) {
			lCiudades.get(i).mostrarDatos();
		}
	}
	
	public static int calcularMediaIngresos(ArrayList<Ciudad> lCiudades) {
		float totalIngresos = 0;
		int totalSedes = 0;
		
		for (int i = 0; i < lCiudades.size(); i++) {
			totalIngresos = lCiudades.get(i).calcularIngresosTotales();
			totalSedes = lCiudades.get(i).getNumSedes();
		}
		
		return (int)(totalIngresos / totalSedes);
	}
	
	public static void mostrarSedesIngresosSupeiorMedia(ArrayList<Ciudad> lCiudades, int media) {
		
		System.out.println("Las sedes con ingresos superiores a la media wue es de: " + media + " son: ");
		for(int i = 0; i < lCiudades.size(); i++) {
			lCiudades.get(i).mostrarSedeSiMayorMedia(media);
		}
	}
	
	public static boolean buscarPorNombre(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		boolean encontrado = false;
		
		System.out.println("Nombre de la sede a buscar");
		
		for(Ciudad ciudad : lCiudades) {
			if(ciudad.buscarPorNombre(entrada.nextLine())) {
				encontrado = true;
			}else {
				encontrado = false;
			}
			
		}
		return encontrado;
	}
	
	public static void menu(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("----------MENU----------");
			System.out.println("1- Añadir una ciudad");
			System.out.println("2- Mostrar ciudades");
			System.out.println("3- Mostrar sedes con ingresos superiores a la media");
			System.out.println("4- Buscar por nombre de sede");
			System.out.println("5- Añadir sede");
			System.out.println("6- Mostrar sedes de mayor a menor");
			System.out.println("");
			System.out.print("      Opcion:");
			num = entrada.nextInt();
			
			switch(num) {
			case 1:
				insertarCiudad(lCiudades);
				break;
			case 2:
				mostrarCiudades(lCiudades);
				break;
			case 3:
				int media = calcularMediaIngresos(lCiudades);
				mostrarSedesIngresosSupeiorMedia(lCiudades, media);
				break;
			case 4:
				buscarPorNombre(lCiudades);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=7);
	}
	
	public static void main(String[] args) {
		ArrayList<Ciudad> lCiudades = new ArrayList<>();
		menu(lCiudades);
	}

}
