public class ModoSuspendido implements EstadoRobot{
    
    private Robot robot;

    public ModoSuspendido(Robot robot){
        this.robot = robot;
    }

    public void suspender(){
        System.out.println("Ya estoy suspendido");
    }

    public void activar(){
        System.out.println("---ACTIVANDO ROBOT---");
        robot.asignarNuevoEstado(robot.getModoActivado());
    }

    public void caminar(){
        System.out.println("Me encuentro suspendido");
    }

    public void atender(){
        System.out.println("Primero deberas activarme");
    }

    public void cocinar(){
        System.out.println("Necesito estar activado y haber tomado una orden para poder cocinar");
        return ;
    }

}
