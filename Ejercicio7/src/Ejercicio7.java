import java.util.Scanner;

public class Ejercicio7 {

	private static Campania campania = new Campania("Campania avanzada");
	
	public static void menu() {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println("-----------MENU-----------");
			System.out.println("1- Añadir donacion");
			System.out.println("2- Mostrar donaciones");
			System.out.println("3- Mostar donaciones por nombre de donante");
			System.out.println("4- Mostrar numero de donaciones");
			System.out.println("5- Mostrar total de dinero recaudado");
			System.out.println("6- Ordenar donaciones");
			System.out.println("7- Salir");
			System.out.print("      Opcion:");
			num = entrada.nextInt();
			
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			}
			
		}while(num!=7);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
