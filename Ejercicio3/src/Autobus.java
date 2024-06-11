import java.util.Map;
import java.util.HashMap;


public class Autobus {

	private String matricula;
	private HashMap<String,Conductor> conductores;
	
	public Autobus() {
		this.matricula = "";
		this.conductores = new HashMap<>();
	}
	
	public Autobus(String matricula) {
		this.matricula = matricula;
		this.conductores = new HashMap<>();;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public HashMap<String, Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(HashMap<String, Conductor> conductores) {
		this.conductores = conductores;
	}

	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", conductores=" + conductores + "]";
	}
	
	
}
