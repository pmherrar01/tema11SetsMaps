import java.util.Scanner;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Ejercicio1 {

	final static String[] DIASSEMANA = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	final static int MAX = 31;
	
	public static void rellenarTemperatuas(Map mapa) {
		Dia dia;
		int i, j, temperatura;
		j = (int) (Math.random() * 7);
		for(i = 0; i < MAX; i++) {
			temperatura = (int)(Math.random() * 45);
			dia = new Dia(DIASSEMANA[j],temperatura);
			mapa.put(i, dia);
			if(j == 6) {
				j=0;
			}else {
				j++;
			}
		}
	}
	
	public static void mostrarTemperaturas(Map mapa) {
		Dia dia;
		int clave;
		Iterator it = mapa.keySet().iterator();
		while(it.hasNext()) {
			clave = (int)it.next();
			dia = (Dia)mapa.get(clave);
			System.out.println(dia.getNombreDia() + " dia " + (clave+1) + " " + dia.getTemperatura() + " grados \n");
		}
	}
	
	public static void temperaturaMedia(Map mapa) {
		float suma=0;
		Dia dia;
		int clave;
		Iterator it = mapa.keySet().iterator();
		while(it.hasNext()) {
			clave = (int)it.next();
			dia = (Dia)mapa.get(clave);
			suma = suma + dia.getTemperatura();
		}
		System.out.println("La temperatura media del mes es de " + (suma / mapa.size()) + "º");
	}
	
	public static void diaCaluroso(Map mapa) {
		int clave, diaCaluroso=0;
		Dia dia;
		Iterator it = mapa.keySet().iterator();
		while(it.hasNext()) {
			clave = (int)it.next();
			dia = (Dia)mapa.get(clave);
			if(dia.getTemperatura()>diaCaluroso) {
				diaCaluroso=dia.getTemperatura();
			}
		}
		System.out.print("Dia o dias mas calurosos: ");
		it = mapa.keySet().iterator();
		while(it.hasNext()) {
			clave = (int)it.next();
			dia = (Dia)mapa.get(clave);
			if(dia.getTemperatura()==diaCaluroso) {
		System.out.println(dia.getNombreDia() + " dia " + (clave+1) + " con " + dia.getTemperatura() + "º");
			}
		}
	}
	
	public static void menu(Map mapa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU--------");
			System.out.println("1- Rellenar de forma aleatoria las temperaturas.");
			System.out.println("2- Mostrar temperaturas");
			System.out.println("3- Mostrar temperatura media");
			System.out.println("4- Mostrar dia o dias mas calurosos del mes");
			System.out.println("5- Salir");
			System.out.print("        Opcion:");
			num=entrada.nextInt();
			
			switch(num) {
			case 1:
				rellenarTemperatuas(mapa);
				break;
			case 2:
				mostrarTemperaturas(mapa);
				break;
			case 3:
				temperaturaMedia(mapa);
				break;
			case 4:
				diaCaluroso(mapa);
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			
			}
		}while(num!=5);
	}
	
	public static void main(String[] args) {
		Map <Integer,Dia> mapa = new HashMap<>();
		menu(mapa);
	}

}
