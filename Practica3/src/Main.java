import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Main. Prueba la funcionalidad del programa a traves de un menu en terminal
 * @author Compunenes
 * @version 1.0
 */
public class Main {

    
	/** 
	 * @param args Array de Strings que se pasan por Terminal
	 */
	public static void main(String[] args) {

	int opcionWhile = 100;
	
        Scanner sc = new Scanner(System.in);
	
        System.out.println("***Bienvenido a WaySub y Pizzas de Don Cangrejo***");
        while(opcionWhile != 3){
            System.out.println("\nSeleccione una opcion: "
			       + "\n1. Hacer una Baguette"
			       + "\n2. Menu de pizzas"
			       + "\n3. Salir del Menu de Opciones\n");
            opcionWhile = sc.nextInt();
            switch(opcionWhile){
                case 1:
                    Menu(1);
                    break;
                case 2:
                    Menu(2);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no registrada");
                    break; 
            }

        }
    }

    
	/** 
	 * @param platillo Platillo a elegir del menu
	 */
	public static void Menu(int platillo){
	DecimalFormat df = new DecimalFormat("#.00");
	Baguettes baguettes;
	Scanner sc = new Scanner(System.in);
	if(platillo == 1){
	    int opcionWhile = 100;
	    System.out.println("---Haz seleccionado Baguette---");
	    while(opcionWhile != 4){
		int opcionIngredientes = 20;
		System.out.println("\nSeleccione su tipo de pan: "
				   + "\n1. Pan Integral"
				   + "\n2. Pan Blanco"
				   + "\n3. Pan de Miel"
				   + "\n4. Salir del Menu de Baguettes\n");
		opcionWhile = sc.nextInt();
		switch(opcionWhile){
                case 1:
                    Baguettes panIntegral = new PanIntegral();
		    System.out.println("¿Deseas agregar algun ingrediente extra a tu Baguette?"
				       + "\n1. Si"
				       + "\n2. No");
		    opcionIngredientes = sc.nextInt();
		    if(opcionIngredientes == 1){
			IngredientesBaguettes(panIntegral);
			break;
		    } else if(opcionIngredientes == 2){
			System.out.println("***Ticket***" + "\nIngredientes Baguette: " + panIntegral.getDescripcion() + ". \nPrecio: $" + df.format(panIntegral.costo()));
			break;
		    } else {
			System.out.println("Opcion no valida");
			break;
		    }
                case 2:
                    Baguettes panBlanco = new PanBlanco();
		    System.out.println("¿Deseas agregar algun ingrediente extra a tu Baguette?"
				       + "\n1. Si"
				       + "\n2. No");
		    opcionIngredientes = sc.nextInt();
		    if(opcionIngredientes == 1){
			IngredientesBaguettes(panBlanco);
			break;
		    } else if(opcionIngredientes == 2){
			System.out.println("***Ticket***" + "\nIngredientes Baguette: " + panBlanco.getDescripcion() + ". \nPrecio: $" + df.format(panBlanco.costo()));
			break;
		    } else {
			System.out.println("Opcion no valida");
			break;
		    }
                case 3:
                    Baguettes panMiel = new PanMiel();
		    System.out.println("¿Deseas agregar algun ingrediente extra a tu Baguette?"
				       + "\n1. Si"
				       + "\n2. No");
		    opcionIngredientes = sc.nextInt();
		    if(opcionIngredientes == 1){
			IngredientesBaguettes(panMiel);
			break;
		    } else if(opcionIngredientes == 2){
			System.out.println("***Ticket***" + "\nIngredientes Baguette: " + panMiel.getDescripcion() + ". \nPrecio: $" + df.format(panMiel.costo()));
			break;
		    } else {
			System.out.println("Opcion no valida");
			break;
		    }
                case 4:
                    break;
                default:
                    System.out.println("Opcion no registrada");
                    break;
		}

	    }
	}
	else {
	    Pizzas pizzaPepperoni = new PizzaPepperoni();
	    Pizzas pizzaEspecial = new PizzaEspecial();
	    Pizzas pizzaHawaiana = new PizzaHawaiana();
	    Pizzas pizzaPollo = new PizzaPollo();
	    Pizzas pizzaSalchicha = new PizzaSalchicha();

	    Baguettes adapterPizzaPepperoni = new AdapterPizzas(pizzaPepperoni);
	    Baguettes adapterPizzaEspecial = new AdapterPizzas(pizzaEspecial);
	    Baguettes adapterPizzaHawaiana = new AdapterPizzas(pizzaHawaiana);
	    Baguettes adapterPizzaPollo = new AdapterPizzas(pizzaPollo);
	    Baguettes adapterPizzaSalchicha = new AdapterPizzas(pizzaSalchicha);

	    int opcionWhilePizzas = 110;
		boolean seVendioPizza = false;

	    System.out.println("---Haz seleccionado Pizza---");
	    while(opcionWhilePizzas != 6 && !(seVendioPizza)){
		System.out.println("\nSeleccione una pizza: "
				   + "\n1." + adapterPizzaPepperoni.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaPepperoni.costo())
				   + "\n\n2." + adapterPizzaEspecial.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaEspecial.costo())
				   + "\n\n3." + adapterPizzaHawaiana.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaHawaiana.costo())
				   + "\n\n4." + adapterPizzaPollo.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaPollo.costo())
				   + "\n\n5." + adapterPizzaSalchicha.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaSalchicha.costo())
				   + "\n\n6. Salir del Menu de Pizzas\n");
		opcionWhilePizzas = sc.nextInt();
		switch(opcionWhilePizzas){
                case 1:
		    		System.out.println("***Ticket***" + "\nPizza seleccionada: " + adapterPizzaPepperoni.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaPepperoni.costo()));
		    		seVendioPizza = true;
					break;
                case 2:
                    System.out.println("***Ticket***" + "\nPizza seleccionada: " + adapterPizzaEspecial.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaEspecial.costo()));
		    		seVendioPizza = true;
					break;
                case 3:
                    System.out.println("***Ticket***" + "\nPizza seleccionada: " + adapterPizzaHawaiana.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaHawaiana.costo()));
		    		seVendioPizza = true;
					break;
                case 4:
		   	 		System.out.println("***Ticket***" + "\nPizza seleccionada: " + adapterPizzaPollo.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaPollo.costo()));
                    seVendioPizza = true;
					break;
				case 5:
		    		System.out.println("***Ticket***" + "\nPizza seleccionada: " + adapterPizzaSalchicha.getDescripcion() + ". \nPrecio: $" + df.format(adapterPizzaSalchicha.costo()));
					seVendioPizza = true;
					break;
				case 6:
					seVendioPizza = true;
					break;
                default:
                    System.out.println("Opcion no registrada");
                    break;
		}

	    }
	}
    }

    
	/** 
	 * @param baguettes Baguette nucleo que se le agregara decoradores
	 */
	public static void IngredientesBaguettes(Baguettes baguettes){
	Scanner sc = new Scanner(System.in);
	int opcionIngredienteExtra = 50;
	DecimalFormat df = new DecimalFormat("#.00");
	while(opcionIngredienteExtra != 10){
	    System.out.println("\nSeleccione algun ingrediente: "
			       + "\n1. Pollo \t$.30" 
			       + "\n2. Pepperoni \t$.27"
			       + "\n3. Jamon \t$.33"
			       + "\n4. Lechuga \t$.15"
			       + "\n5. Jitomate \t$.12"
			       + "\n6. Cebolla \t$.10"
			       + "\n7. Mostaza \t$.07"
			       + "\n8. Catsup \t$.05"
			       + "\n9. Mayonesa \t$.06"
			       + "\n10. Mi Baguette esta lista\n");
	    opcionIngredienteExtra = sc.nextInt();
	    switch(opcionIngredienteExtra){
	    case 1:
		baguettes = new Pollo(baguettes);
		break;
	    case 2:
		baguettes = new Pepperoni(baguettes);
		break;
	    case 3:
		baguettes = new Jamon(baguettes);
		break;
	    case 4:
		baguettes = new Lechuga(baguettes);
		break;
	    case 5:
		baguettes = new Jitomate(baguettes);
		break;
	    case 6:
		baguettes = new Cebolla(baguettes);
		break;
	    case 7:
		baguettes = new Mostaza(baguettes);
		break;
	    case 8:
		baguettes = new Catsup(baguettes);
		break;
	    case 9:
		baguettes = new Mayonesa(baguettes);
		break;
	    case 10:
		break;
	    default:
		System.out.println("Opcion no registrada");
		break;
	    }
	}
	System.out.println("***Ticket***" + "\nIngredientes Baguette: " + baguettes.getDescripcion() + ". \nPrecio: $" + df.format(baguettes.costo()));
    }   
}
