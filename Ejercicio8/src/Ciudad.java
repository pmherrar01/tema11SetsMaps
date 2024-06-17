import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;


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
			cSedes.add(sede);
			System.out.println("Deseas añadir otra sede?");
			respuesta = entrada2.nextLine();
		}while(respuesta.equalsIgnoreCase("si"));
	}

	public void añadirSede(Sede sede) {
		cSedes.add(sede);
	}

	public int getNumSedes() {
		return this.cSedes.size();
	}

	public void mostrarCiudad(){
		System.out.println("Ciudad: " + this.nombreCuidad);
		//Mostramos todas las sedes almacenadas en el conjunto cSedes
		for(Sede s:this.cSedes){
			s.mostrarDatos();
		}
	}

	public float calcularIngresosTotales() {
		float total=0;

		for(Sede sede : this.cSedes) {
			total = total + sede.getIngresos();
		}
		return total;
	}

	public void mostrarSedeSiMayorMedia(int media) {
		for(Sede sede : this.cSedes) {
			if(sede.getIngresos() > media) {
				System.out.println(sede);
			}
		}

	}

	public boolean buscarPorNombre(String nombre) {
		Iterator<Sede> it = this.cSedes.iterator();
        boolean enc = false;
        Sede sedeAux;
        //Mientras no lo encuentre y mientras no llegue al final
        while((!enc)&&(it.hasNext())){
            sedeAux = it.next();
            if  (sedeAux.getNombreSede().equalsIgnoreCase(nombre)){
                enc = true;
            }
        }
        return enc;
	}
}
