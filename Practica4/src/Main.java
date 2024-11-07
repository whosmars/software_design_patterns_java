import java.util.Scanner;
/**
 * Clase Main. Prueba el correcto funcionamiento del Patron de Disenio Builder
 */
public class Main{
    
	/** 
	 * @param args argumentos por terminal. Son opcionales
	 */
	public static void main(String [] args){
	TallerDeEnsamblaje tallerEnsamblaje = new TallerDeEnsamblaje();
	Scanner sc = new Scanner(System.in);
	int presupuesto;
	int opcionWhile = 100;
	int opcion;

	System.out.println("***Bienvenido***" + "\n¿De cuanto presupuesto dispones?");

	while(true){
	    try{
		presupuesto = Integer.parseInt(sc.nextLine());
		tallerEnsamblaje.personalizarNave(presupuesto);

		while(opcionWhile == 100){

		    System.out.println("Su presupuesto no es sufuciente, seleccione una opcion: "
				       + "\n1.- Disenar otra nave"
				       + "\n2.- Ver nuestro catalogo"
				       + "\n0.- Salir");

		    opcion = sc.nextInt();

		    switch(opcion){
		    case 1:
			tallerEnsamblaje.personalizarNave(presupuesto);
			break;
		    case 2:
			Main.catalogo(presupuesto);
			break;
		    case 0:
			opcionWhile = 0;
			System.exit(0);
			break;
		    default:
			System.out.println("La opcion ingresada no es valida.");
			break;
		    }
		}
	    }catch(NumberFormatException e){
		System.out.println("La opcion ingresada no es valida.");
	    }
	}

    }

    
	/** 
	 * @param presupuesto cuota maxima del coste de Nave
	 */
	public static void catalogo(int presupuesto){
	TallerDeEnsamblaje tallerEnsamblaje = new TallerDeEnsamblaje();
	Scanner sc = new Scanner(System.in);
	int opcionWhile = 100;
	int opcion;

	while(opcionWhile == 100){
	    System.out.println("***Opciones catalogo***"
			       + "\n1.- Nave Individual de Combate"
			       + "\n2.- Nave Militar de Transporte"
			       + "\n3.- Base Especial de Guerra"
			       + "\n0.- Salir");
	    opcion = sc.nextInt();
	    switch(opcion){
	    case 1:
		tallerEnsamblaje.ensamblaNaveIndividualDeCombate(presupuesto);
		break;
	    case 2:
		tallerEnsamblaje.ensamblaNaveMilitarTransporte(presupuesto);
		break;
	    case 3:
		tallerEnsamblaje.ensamblaBaseEspacialDeGuerra(presupuesto);
		break;
	    case 0:
		opcionWhile = 0;
		break;
	    default:
		System.out.println("La opcion ingresada no es valida.");
		break;
	    }
	}
    }
}
