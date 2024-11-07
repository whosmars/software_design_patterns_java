/**
 * Clase que implemente interfaz Componente. Define el comportamiento de un componente Sistema de Propulsion
 */
public abstract class SistemaDePropulsion implements Componente{

    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public abstract String descripcion();

    
    /** 
     * @return double velocidad del componente
     */
    @Override
    public abstract double velocidad();

    
    /** 
     * @return double peso del componente
     */
    @Override
    public abstract double peso();

    
    /** 
     * @return double precio del componente
     */
    @Override
    public abstract double precio();

    public void muestraComponente() {
        System.out.println("------------------------");
        System.out.println("Nombre: " + this.nombre());
        System.out.println("Descripción: " + this.descripcion());
        System.out.println("Ataque: " + this.ataque());
        System.out.println("Defensa: " + this.defensa());
        System.out.println("Velocidad: " + this.velocidad());
        System.out.println("Peso: " + this.peso());
        System.out.println("Precio: " + this.precio());
    }
    
}
