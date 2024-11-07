public class ModoCocinando implements EstadoRobot{
    
    private Robot robot;

    public ModoCocinando(Robot robot){
        this.robot = robot;
    }

    public void suspender(){
        robot.asignarNuevoEstado(robot.getModoSuspendido());
    }

    public void activar(){
        System.out.println("Ya estoy activado");
    }

    public void caminar(){
        System.out.println("No puedo caminar porque estoy cocinando");
    }

    public void atender(){
        System.out.println("No puedo tomar otra orden en este momento");
    }

    public void cocinar(){
        if(robot.getOrden() == null){
            System.out.println("Ha ocurrido un error en el sistema. Tittu volvera a desactivarse");
            this.robot.asignarNuevoEstado(this.robot.getModoSuspendido());
            return;
        }
        if(robot.getOrden().cocinandoCarne() < 100){
            System.out.println("--Se esta cocinando tu carne. Vuelva a presionar Cocinar---");
            return;
        }
        System.out.println("Se ha terminado de cocinar tu hamburguesa.");
        this.robot.getOrden().preparacion();
        System.out.println("\nTome su Hamburguesa\n----Apagando Sistema :/----");
        this.robot.setOrden(null);
        this.robot.asignarNuevoEstado(this.robot.getModoSuspendido());
        return;

    }
    
}
