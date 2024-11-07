/**
 * Clase Robot. Define todas las "acciones" que deberia realizar. Define un estado inicial "suspendido"
 * @author Compunenes
 * @version 1.0
 */
public class Robot{

    private EstadoRobot estadoActual;

	private EstadoRobot modoSuspendido;

	private EstadoRobot modoActivado;

	private EstadoRobot modoAtendiendo;

	private EstadoRobot modoCaminando;

	private EstadoRobot modoCocinando;

    private Hamburguesa ordenRecibida;

    public Robot(){
        this.modoSuspendido = new ModoSuspendido(this);
        this.modoActivado = new ModoActivado(this);
        this.modoAtendiendo = new ModoAtendiendo(this);
        this.modoCaminando = new ModoCaminando(this);
        this.modoCocinando = new ModoCocinando(this);
        this.estadoActual = this.modoSuspendido;
        this.ordenRecibida = null;
    }

    public void suspender(){
        this.estadoActual.suspender();
        return;
    }

    public void activar(){
        this.estadoActual.activar();
        return;
    }

    public void caminar(){
        this.estadoActual.caminar();
        return;
    }

    public void atender(){
        this.estadoActual.atender();
        return;
    }

    public void cocinar(){
        this.estadoActual.cocinar();
        return;
    }

    
    /** 
     * @param nuevoEstado Estado que se le quiera asignar al robot
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
        this.estadoActual = nuevoEstado;
        return;
    }

    
    /** 
     * @return EstadoRobot ModoActivado
     */
    public EstadoRobot getModoActivado() {
        return modoActivado;
    }

    
    /** 
     * @return EstadoRobot ModoAtendiendo
     */
    public EstadoRobot getModoAtendiendo() {
        return modoAtendiendo;
    }

    
    /** 
     * @return EstadoRobot ModoCaminando
     */
    public EstadoRobot getModoCaminando() {
        return modoCaminando;
    }

    
    /** 
     * @return EstadoRobot ModoSuspendido
     */
    public EstadoRobot getModoSuspendido() {
        return modoSuspendido;
    }

    
    /** 
     * @return EstadoRobot ModoCocinando
     */
    public EstadoRobot getModoCocinando() {
        return modoCocinando;
    }

    
    /** 
     * @return Hamburguesa regresa la Hamburguesa asociada a la orden del cliente. Si no hay eleccion, regresa null
     */
    public Hamburguesa getOrden(){
        return this.ordenRecibida;
    }

    
    /** 
     * @param h Hamburguesa del cliente
     */
    public void setOrden(Hamburguesa h){
        this.ordenRecibida = h;
    }

}