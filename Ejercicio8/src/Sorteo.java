import java.time.LocalDate;

public class Sorteo {

	private LocalDate fechaSorteo;
	private int[] vNumGanadores;
	
	public Sorteo() {
		this.fechaSorteo = LocalDate.now();
		this.vNumGanadores = new int[4];
		
		for(int i = 0; i < vNumGanadores.length; i++) {
			vNumGanadores[i] = (int) (Math.random()*101) +1;
		}
	}
	
	public Sorteo(LocalDate fechaSorteo) {
		this.fechaSorteo = fechaSorteo;
		this.vNumGanadores = new int[4];
		
		for(int i = 0; i < vNumGanadores.length; i++) {
			vNumGanadores[i] = (int) (Math.random()*100) +1;
		}
	}

	public LocalDate getFechaSorteo() {
		return fechaSorteo;
	}

	public void setFechaSorteo(LocalDate fechaSorteo) {
		this.fechaSorteo = fechaSorteo;
	}	
	
	@Override
    public String toString() {
        String cadena = "    Sorteo{" + fechaSorteo + ", Números ganadores: ";
        for(int i = 0;i < this.vNumGanadores.length;i++){
            cadena = cadena + vNumGanadores[i] + " ";
        }
        cadena = cadena + "}";
        return cadena;
    }
}
