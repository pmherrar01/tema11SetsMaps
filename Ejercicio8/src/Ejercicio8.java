import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Ejercicio8 {
	
	public static void insertarCiudad(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		String nombreCiudad, respuesta;
		Ciudad ciudad;
		
		System.out.println("Nombre ciudad: ");
		nombreCiudad = entrada.nextLine();
		
		ciudad = new Ciudad(nombreCiudad);
		
		ciudad.rellenarSedes();
		lCiudades.add(ciudad);
	}
	
    public static void mostrarCiudades(ArrayList<Ciudad> lCiudades){
        for(int i = 0;i < lCiudades.size();i++){
            lCiudades.get(i).mostrarCiudad();
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
	
	public static boolean buscarPorNombre(ArrayList<Ciudad> lCiudades, String nombre) {
		int i = 0;
        boolean enc = false;
        while((!enc)&&(i < lCiudades.size())){
            if  (lCiudades.get(i).buscarPorNombre(nombre)){
                enc = true;
            }
            else{
                i++;
            }
        }
        return enc;
	}
	
	public static void añadirSedePorNombreCiudad(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		boolean encontrado;
		
		do {
			System.out.print("Nombre de ciudad a buscar:");
			nombre = entrada.nextLine();
			for(Ciudad ciudad : lCiudades) {
				if(ciudad.getNombreCuidad().equalsIgnoreCase(nombre)) {
					encontrado=true;
					ciudad.rellenarSedes();
				}
			}
		}while(encontrado=false);
		
	}
	 private static int buscarPosicionDeSede(ArrayList<Sede> lSedesOrdenadas, Sede sedeAux){
	        int i = 0;
	        boolean enc = false;
	        while((!enc) &&(i < lSedesOrdenadas.size())){
	            if  (sedeAux.getIngresos() > lSedesOrdenadas.get(i).getIngresos()){
	                enc = true;
	            }
	            else{
	                i++;
	            }
	        }
	        return i;
	    }
	
    private static void insertarSedesEnOrden(ArrayList<Sede> lSedesOrdenadas, Set<Sede> cSedesAux){
        int pos;
        for(Sede sedeAux:cSedesAux){
            pos = buscarPosicionDeSede(lSedesOrdenadas, sedeAux);
            lSedesOrdenadas.add(pos, sedeAux);  //Insertamos ordenadamente la sede que estamos tratando
        }
    }
	
	public static void mostrarSedesOrdenadasPorIngresos(ArrayList<Ciudad> lCiudades){
        ArrayList<Sede> lSedesOrdenadas = new ArrayList<>();
        Set<Sede> cSedesAux;
        for(int i = 0;i < lCiudades.size();i++){
            cSedesAux = lCiudades.get(i).getcSedes();
            insertarSedesEnOrden(lSedesOrdenadas, cSedesAux);
        }
        System.out.println("Sedes ordenadas: ");
        for(Sede sedeAux:lSedesOrdenadas){
            System.out.println(sedeAux.toString());
        }
    }
	
	public static void menu(ArrayList<Ciudad> lCiudades) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		String nombre;
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
				System.out.println("Nombre de la sede a buscar");
				nombre = entrada1.nextLine();
				if(buscarPorNombre(lCiudades, nombre)) {
					System.out.println("La sede con nombre: " + nombre + "ha sido encontrada");
				}else {
					System.out.println("La sede con nombre: " + nombre + "no existe");
				}
				
				break;
			case 5:
				añadirSedePorNombreCiudad(lCiudades);
				break;
			case 6:
				mostrarSedesOrdenadasPorIngresos(lCiudades);
				break;
			}
		}while(num!=7);
	}
	
	public static void main(String[] args) {
		ArrayList<Ciudad> lCiudades = new ArrayList<>();
		menu(lCiudades);
	}

}
