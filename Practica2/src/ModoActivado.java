public class ModoActivado implements EstadoRobot{
    
    private Robot robot;

    public ModoActivado(Robot robot){
        this.robot = robot;
    }

    public void suspender(){
        System.out.print("---Apagando robot---");
        robot.asignarNuevoEstado(robot.getModoSuspendido());
    }

    public void activar(){
        System.out.println("Ya estoy activado");
    }

    public void caminar(){
        System.out.print("---Me encuentro caminando---");
        robot.asignarNuevoEstado(robot.getModoCaminando());
    }

    public void atender(){
        System.out.println("Estoy lejos para tomar tu orden");
    }

    public void cocinar(){
        System.out.println("No he tomado una orden");
    }
    
}
