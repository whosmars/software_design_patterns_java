import java.util.Iterator;
import java.util.Scanner;

public class ModoAtendiendo implements EstadoRobot{
    
    private Robot robot;

    public ModoAtendiendo(Robot robot){
        this.robot = robot;
    }

    public void suspender(){
        System.out.println("No puedo suspenderme en este momento");
    }

    public void activar(){
        System.out.println("Ya estoy activado");
    }

    public void caminar(){
        System.out.println("No puedo caminar porque estoy tomando tu orden");
    }

    public void atender(){
        MenuDeLujo mLujo = new MenuDeLujo();
        MenuDelDia mDia = new MenuDelDia();
        MenuGeneral mGeneral = new MenuGeneral();

        System.out.println("Estas son las opcione disponibles el dia de hoy:");
        Iterator<Hamburguesa> iteradorGeneral = mGeneral.crearIterador();
        while(iteradorGeneral.hasNext())
            System.out.println(iteradorGeneral.next().toString());
        Iterator<Hamburguesa> iteradorDia = mDia.crearIterador();
        while(iteradorDia.hasNext())
            System.out.println(iteradorDia.next().toString());
        Iterator<Hamburguesa> iteradorLujo = mLujo.crearIterador();
        while(iteradorLujo.hasNext())
            System.out.println(iteradorLujo.next().toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nElige una hamburguesa (Escribe el id): ");
        int eleccionHamburguesa = sc.nextInt();
        Hamburguesa apuntador = null;

        Iterator<Hamburguesa> iteradorGeneralDos = mGeneral.crearIterador();
        while(iteradorGeneralDos.hasNext()){
            apuntador = iteradorGeneralDos.next();
            if(apuntador.getID() == eleccionHamburguesa)
                this.robot.setOrden(apuntador);
        }

        Iterator<Hamburguesa> iteradorDiaDos = mDia.crearIterador();
        while(iteradorDiaDos.hasNext()){
            apuntador = iteradorDiaDos.next();
            if(apuntador.getID() == eleccionHamburguesa)
                this.robot.setOrden(apuntador);
        }

        Iterator<Hamburguesa> iteradorLujoDos = mLujo.crearIterador();
        while(iteradorLujoDos.hasNext()){
            apuntador = iteradorLujoDos.next();
            if(apuntador.getID() == eleccionHamburguesa)
                this.robot.setOrden(apuntador);
        }

        if(this.robot.getOrden() == null){
            System.out.println("No se ha encontrado tu eleccion. Se te dara una Hamburguesa Sencilla");
            this.robot.setOrden(new HamburguesaSencilla());
        }
        System.out.print("Has elegido: " + this.robot.getOrden().getNombre()
                        + ". Titto empezara a cocinar tu hamburguesa. Presiona 5");
        this.robot.asignarNuevoEstado(this.robot.getModoCocinando());
    }

    public void cocinar(){
        System.out.println("Debes completar tu orden");
        return;
    }
    
}
