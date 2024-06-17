import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Campania {

	private String nombreCampaña;
	private Set<Donacion> cDonaciones;

	public Campania() {
		this.nombreCampaña = "";
		this.cDonaciones = new HashSet<>();
	}

	public Campania(String nombreCampaña) {
		this.nombreCampaña = nombreCampaña;
		this.cDonaciones = new HashSet<>();
	}

	public String getNombreCampaña() {
		return nombreCampaña;
	}

	public void setNombreCampaña(String nombreCampaña) {
		this.nombreCampaña = nombreCampaña;
	}

	public Set<Donacion> getcDonaciones() {
		return cDonaciones;
	}

	public void setcDonaciones(Set<Donacion> cDonaciones) {
		this.cDonaciones = cDonaciones;
	}

	public void insertarDonaciones(Donacion donacion) {
		this.cDonaciones.add(donacion);
	}

	public void mostrarDatos() {
		for(Donacion donacion : cDonaciones) {
			donacion.mostrarDatos();
		}
	}

	public void mostarPorNombre(String nombre) {
		Donacion donacion;
		Iterator<Donacion> it = this.cDonaciones.iterator();
		boolean donacionEncontrada = false;
		while(it.hasNext()) {
			donacion=it.next();
			if(donacion.getNombreDonante().equalsIgnoreCase(nombre)) {
				donacion.mostrarDatos();
				donacionEncontrada = true;
			}
		}
		
		if(!donacionEncontrada) {
			System.out.print("No hemos encontrado el donante con el nombre: " + nombre);
		}

	}
	
	public int getNumDonaciones() {
		return this.cDonaciones.size();
	}
	
	public int  calcularDinero() {
		int suma = 0;
		
		for (Donacion donacion : cDonaciones) {
			suma = (int) (suma + donacion.getDonacion());
		}
		return suma;
	}
	
	public void ordenarDonaciones(){
        Donacion[] vDonaciones = new Donacion[this.cDonaciones.size()];
        
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            insertarDonacionEnOrden(vDonaciones, aux);
        }
        for(int i = 0;i < vDonaciones.length;i++){
            vDonaciones[i].mostrarDatos();
        }
    }
	
	private void insertarDonacionEnOrden(Donacion[] vDonaciones, Donacion nDonacion){
        int i = 0;
        boolean enc = false;
        while((vDonaciones[i] != null)&&(!enc)){
            if  (nDonacion.getDonacion() > vDonaciones[i].getDonacion()){
                enc = true;
            }
            else{
                i++;
            }
        }
        if  (vDonaciones[i] != null){
            for(int j = vDonaciones.length - 1; j > i;j--){
                vDonaciones[j] = vDonaciones[j-1];
            }
        }
        vDonaciones[i] = nDonacion;
    }

	@Override
	public String toString() {
		return "Campania [nombreCampaña=" + nombreCampaña + ", cDonaciones=" + cDonaciones + "]";
	}


}
