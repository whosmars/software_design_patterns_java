import java.util.Scanner;
/**
 * Clase encargada de la construccion de objetos Nave.
 */
public class TallerDeEnsamblaje{

    
	/** 
	 * @param presupuesto cuota maxima del dinero de la nava
	 * @return Nave ensamblada con sus componentes
	 */
	public Nave ensamblaNaveIndividualDeCombate(int presupuesto){
        Nave nave = new Nave();
        nave.agregaComponente(new BlindajeSimple());
        nave.agregaComponente(new LaserSimple());
        nave.agregaComponente(new CabinaUnPiloto());
        nave.agregaComponente(new ViajeIntercontinental());
	System.out.println("\nNave Individual de Combate\n");
	TallerDeEnsamblaje.caracteristicasNave(nave);
	if(presupuesto >= nave.obtenPrecio()){
	    System.out.println("***Tu nave esta lista para recoger***");
	    System.out.println("\nNave Individual de Combate\n");
	    TallerDeEnsamblaje.caracteristicasNave(nave);
	    System.exit(0);
	} else {
	    System.out.println("Su presupuesto no es suficiente");
	}
        return nave;
    }

    
	/** 
	 * @param presupuesto cuota maxima de dinero de la nave
	 * @return Nave ensamblada con sus componentes
	 */
	public Nave ensamblaNaveMilitarTransporte(int presupuesto){
        Nave nave = new Nave();
        nave.agregaComponente(new BlindajeReforzado());
        nave.agregaComponente(new MisilDePlasma());
        nave.agregaComponente(new CabinaTripulacionPequena());
        nave.agregaComponente(new ViajeInterplanetario());
	System.out.println("\nNave Militar de Transporte\n");
	TallerDeEnsamblaje.caracteristicasNave(nave);
	if(presupuesto >= nave.obtenPrecio()){
	    System.out.println("***Tu nave esta lista para recoger***");
	    System.out.println("\nNave Militar de Transporte\n");
	    TallerDeEnsamblaje.caracteristicasNave(nave);
	    System.exit(0);
	} else {
	    System.out.println("Su presupuesto no es suficiente");
	}
        return nave;
    }

    
	/** 
	 * @param presupuesto cuota maxima del dinero de la nave 
	 * @return Nave ensamblada con sus componente
	 */
	public Nave ensamblaBaseEspacialDeGuerra(int presupuesto){
        Nave nave = new Nave();
        nave.agregaComponente(new BlindajeFortaleza());
        nave.agregaComponente(new MisilDePlasma());
        nave.agregaComponente(new CabinaEjercito());
        nave.agregaComponente(new ViajeIntergalactico());
	System.out.println("\nBase Espacial de Guerra\n");
	TallerDeEnsamblaje.caracteristicasNave(nave);
	if(presupuesto >= nave.obtenPrecio()){
	    System.out.println("***Tu nave esta lista para recoger***");
	    System.out.println("\nBase Espacial de Guerra\n");
	    TallerDeEnsamblaje.caracteristicasNave(nave);
	    System.exit(0);
	} else {
	    System.out.println("Su presupuesto no es suficiente");
	}
        return nave;
    }

    
	/** 
	 * @param presupuesto cuota maxima de dinero
	 * @return Nave con componentes personalizados por el cliente
	 */
	public Nave personalizarNave(int presupuesto){
        Nave nave = new Nave();
	
	Scanner sc = new Scanner(System.in);
	
	int opcion;

	do{
	    System.out.println("Estos son los componentes disponibles de todas las categorias: \n");
	    System.out.println("Sistema de propulsion: \n1.- Viaje intercontinental\n2.- Viaje interplanetario\n3.- Viaje intergalactico"
			       + "\n\nBlindaje: \n4.- Simple\n5.- Reforzado\n6.- Fortaleza"
			       + "\n\nCabina: \n7.- Un piloto\n8.- Tripulacion pequena\n9.- Ejercito"
			       + "\n\nArmas: \n10.- Laser simple\n11.- Misiles de plasma\n12.- Laser destructor de planetas"
			       + "\n\n0.- Salir");
	    opcion = sc.nextInt();

	    switch(opcion){
	    case 1:
		nave.agregaComponente(new ViajeIntercontinental());
		break;
	    case 2:
		nave.agregaComponente(new ViajeInterplanetario());
		break;
	    case 3:
		nave.agregaComponente(new ViajeIntergalactico());
		break;
	    case 4:
		nave.agregaComponente(new BlindajeSimple());
		break;
	    case 5:
		nave.agregaComponente(new BlindajeReforzado());
		break;
	    case 6:
		nave.agregaComponente(new BlindajeFortaleza());
		break;
	    case 7:
		nave.agregaComponente(new CabinaUnPiloto());
		break;
	    case 8:
		nave.agregaComponente(new CabinaTripulacionPequena());
		break;
	    case 9:
		nave.agregaComponente(new CabinaEjercito());
		break;
	    case 10:
		nave.agregaComponente(new LaserSimple());
		break;
	    case 11:
		nave.agregaComponente(new MisilDePlasma());
		break;
	    case 12:
		nave.agregaComponente(new LaserDestructorDePlanetas());
		break;
	    case 0:
		break;
	    default:
		System.out.println("La opcion ingresada no es valida.");
		break;
	    }
	
	} while(opcion != 0);
	
	if(presupuesto >= nave.obtenPrecio()){
	    System.out.println("***Tu nave esta lista para recoger***");
	    TallerDeEnsamblaje.caracteristicasNave(nave);
	    System.exit(0);
	}

	return nave;
    }

    
	/** 
	 * @param nave imprime en terminal las caracteristicas de la Nave y sus componentes
	 */
	public static void caracteristicasNave(Nave nave) {
	System.out.println("Componentes de la nave: ");
	nave.muestraComponentes();
	System.out.println("\nCaracteristicas de la nave: ");
	nave.muestraNave();
	System.out.println("\nPrecio de la nave: " + nave.obtenPrecio());
	return ;
    }
}
