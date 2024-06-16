import java.util.Scanner;


public class Donacion {

	private String nombreDonante;
	private float donacion;
	
	public Donacion() {
		this.nombreDonante = "";
		this.donacion = 0;
	}

	public Donacion(String nombreDonante, float donacion) {
		this.nombreDonante = nombreDonante;
		this.donacion = donacion;
	}
	
	public String getNombreDonante() {
		return nombreDonante;
	}

	public void setNombreDonante(String nombreDonante) {
		this.nombreDonante = nombreDonante;
	}

	public float getDonacion() {
		return donacion;
	}

	public void setDonacion(float donacion) {
		this.donacion = donacion;
	}

	public void mostrarDatos() {
		System.out.println(this.nombreDonante);
		System.out.println(this.donacion);
	}
	
	@Override
	public String toString() {
		return "Donacion [nombreDonante=" + nombreDonante + ", donacion=" + donacion + "]";
	}
	
	
	
}
