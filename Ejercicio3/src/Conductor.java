
public class Conductor {

	private String dni;
	private String nombreConductor;
	
	public Conductor() {
		this.dni = "";
		this.nombreConductor = "";
	}
	
	public Conductor(String dni, String nombreConductor) {
		this.dni = dni;
		this.nombreConductor = nombreConductor;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	@Override
	public String toString() {
		return "Conductor [dni=" + dni + ", nombreConductor=" + nombreConductor + "]";
	}
	
	
	
}
