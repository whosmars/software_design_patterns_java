import java.util.Scanner;

public class Main{
    
    /** 
     * @param args Arreglo de caracteres para interactuar en terminal
     */
    public static void main(String[] args) {
        
        Robot titto = new Robot();
        int opcionWhile = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a McBurguesas. Seras el encargado de manejar a Robot Titto no.61 (nuestro robot mesero/cocinero)");
        while(opcionWhile != 6){
            System.out.println("\nSeleccione una opcion: "
                                + "\n1. Suspender a Titto"
                                + "\n2. Activar a Titto"
                                + "\n3. Mandar a Titto a atender una mesa (Caminar hacia la mesa)"
                                + "\n4. Tomar la orden"
                                + "\n5. Cocinar hamburguesa"
                                + "\n6. Salir del Menu de Opciones\n");
            opcionWhile = sc.nextInt();
            switch(opcionWhile){
                case 1:
                    titto.suspender();
                    break;
                case 2:
                    titto.activar();
                    break;
                case 3:
                    titto.caminar();
                    break;
                case 4:
                    titto.atender();
                    break;
                case 5:
                    titto.cocinar();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no registrada");
                    break; 
            }

        }
    
    }
}