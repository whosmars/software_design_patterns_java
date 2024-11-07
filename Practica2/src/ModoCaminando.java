public class ModoCaminando implements EstadoRobot{
    
    private Robot robot;

    public ModoCaminando(Robot robot){
        this.robot = robot;
    }

    public void suspender(){
        System.out.println("--Apagando---");
        robot.asignarNuevoEstado(robot.getModoSuspendido());
    }

    public void activar(){
        System.out.println("Ya estoy activado");
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void atender(){
        System.out.println("---Titto esta por atender una mesa. Vuelva a presionar 4---");
        robot.asignarNuevoEstado(robot.getModoAtendiendo());
    }

    public void cocinar(){
        System.out.println("No he tomado una orden");
        return;
    }
    
}
