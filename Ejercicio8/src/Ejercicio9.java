import java.util.TreeMap;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {

	public static void hacerSorteo(Map<LocalDate,Sorteo> mSorteos) {
		Sorteo sorteo = new Sorteo();
		mSorteos.put(sorteo.getFechaSorteo(), sorteo);
		
		System.out.println(sorteo);
	}
	
	public static void mostrarSorteosMesActual(Map<LocalDate,Sorteo> mSorteos) {
		LocalDate fechaActual = LocalDate.now();
		Sorteo sorteo;
        System.out.println(" -- Sorteos "+fechaActual.getMonthValue()+"/"+fechaActual.getYear()+" --");

        for (LocalDate fSorteo: mSorteos.keySet()) {
        	sorteo = mSorteos.get(fSorteo);
        	if(sorteo.getFechaSorteo().getMonthValue() == fechaActual.getMonthValue()) {
        		System.out.println(sorteo);
        	}
        }
        
	}
	
	public static LocalDate pedirFecha() {
		Scanner entrada = new Scanner(System.in);
		LocalDate fecha;
		int dia,mes,anio;
		
		System.out.println("Año");
		anio=entrada.nextInt();
		System.out.println("Mes");
		mes=entrada.nextInt();
		System.out.println("Dia");
		dia=entrada.nextInt();
		
		
		fecha = LocalDate.of(anio,mes,dia);
		
		return fecha;
		}
	
	public static void mostrarMesPorFecha(Map<LocalDate,Sorteo> mSorteos, LocalDate fecha) {
		if(mSorteos.containsKey(fecha)) {
			System.out.println(mSorteos.get(fecha));
		}else {
			System.out.println("No se a encontrado ningun sorteo para la fecha: " + fecha );
		}
	}
	
	public static void realizarSorteoPorFecha(Map<LocalDate,Sorteo> mSorteos, LocalDate fecha) {
		Sorteo sorteo;
		if(mSorteos.containsKey(fecha)){
			System.out.println("Ya existe un sorteo para la fecha: " + fecha);
		}else {
			sorteo = new Sorteo();
			mSorteos.put(fecha, sorteo);
			System.out.println(sorteo);
		}
	}
	
	public static void mostrarSorteos(Map<LocalDate,Sorteo> mSorteos) {
		Sorteo sorteo;
		for(LocalDate fechaSorteo : mSorteos.keySet()) {
			sorteo = mSorteos.get(fechaSorteo);
			System.out.print(sorteo);
		}
	}
	
	public static void menu(Map<LocalDate,Sorteo> mSorteos) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("---------MENU---------");
			System.out.println("1- Realizar sorteo:");
			System.out.println("2- Repetir sorteo: ");
			System.out.println("3- Mostrar sorteos del mes actual");
			System.out.println("4- Mostrar Sorteos dada una fecha");
			System.out.println("5- Realizar sorteo a traves dde una fecha");
			System.out.println("6- Mostrar todos los sorteos");
			System.out.println("7- salir");
			System.out.print("			Opcion: ");
			num = entrada.nextInt();
			
			switch(num){
			case 1:
				hacerSorteo(mSorteos);
				break;
			case 2:
				hacerSorteo(mSorteos);
				break;
			case 3:
				mostrarSorteosMesActual(mSorteos);
				break;
			case 4:
				LocalDate fecha = pedirFecha();
				mostrarMesPorFecha(mSorteos, fecha);
				break;
			case 5:
				LocalDate fecha1 = pedirFecha();
				realizarSorteoPorFecha(mSorteos, fecha1);
				break;
			case 6:
				mostrarSorteos(mSorteos);
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=7);
	}
	
	public static void main(String[] args) {
		Map<LocalDate,Sorteo> mSorteos = new TreeMap<>();
		menu(mSorteos);
	}

}
