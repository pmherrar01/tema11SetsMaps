
public class Dia {

	private String nombreDia;
	private int temperatura;
	
	public Dia(String nombreDia, int temperatura) {
		this.nombreDia = nombreDia;
		this.temperatura = temperatura;
	}
	
	public Dia() {
		this.nombreDia = "";
		this.temperatura = 0;
	}

	public String getNombreDia() {
		return nombreDia;
	}

	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
