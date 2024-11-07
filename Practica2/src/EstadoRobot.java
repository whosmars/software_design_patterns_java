/**
 * Interfaz EstadoRobot. Define todas las "acciones" que deberia realizar Tittu en todos sus posibles estados
 * @author Compunenes
 * @version 1.0
 */
public interface EstadoRobot{

    public void suspender();

    public void activar();

    public void caminar();

    public void atender();

    public void cocinar();

}