import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Ciudad {

	private String nombreCuidad;
	private Set<Sede> cSedes;

	public Ciudad() {
		this.nombreCuidad = nombreCuidad;
		this.cSedes = new HashSet<>();
	}

	public Ciudad(String nombreCuidad) {
		this.nombreCuidad = nombreCuidad;
		this.cSedes = new HashSet<>();
	}



	public String getNombreCuidad() {
		return nombreCuidad;
	}

	public void setNombreCuidad(String nombreCuidad) {
		this.nombreCuidad = nombreCuidad;
	}

	public Set<Sede> getcSedes() {
		return cSedes;
	}

	public void setcSedes(Set<Sede> cSedes) {
		this.cSedes = cSedes;
	}

	public void rellenarSedes() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Sede sede;
		String nombreSede, respuesta;
		float ingresos;
		do {
			System.out.print("Nombre de la sede: ");
			nombreSede = entrada.nextLine();

			System.out.print("Ingresos: ");
			ingresos = entrada1.nextFloat();

			sede = new Sede(nombreSede,ingresos);		
			System.out.println("Deseas añadir otra sede?");
			respuesta = entrada2.nextLine();
		}while(respuesta.equalsIgnoreCase("si"));
	}

	public void añadirSede(Sede sede) {
		cSedes.add(sede);
	}


}
