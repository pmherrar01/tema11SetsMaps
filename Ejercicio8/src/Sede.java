
public class Sede {

	private String nombreSede;
	private float ingresos;
	
	public Sede() {
		this.nombreSede = "";
		this.ingresos = 0;
	}
	
	public Sede(String nombreSede, float ingresos) {
		this.nombreSede = nombreSede;
		this.ingresos = ingresos;
	}

	public String getNombreSede() {
		return nombreSede;
	}

	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}

	public float getIngresos() {
		return ingresos;
	}

	public void setIngresos(float ingresos) {
		this.ingresos = ingresos;
	}
	
	public void mostrarDatos() {
		System.out.println("        " + this.nombreSede);
		System.out.println("        " + this.ingresos);
	}

	@Override
	public String toString() {
		return "Sede [nombreSede=" + nombreSede + ", ingresos=" + ingresos + "]";
	}
	
	
	
}
