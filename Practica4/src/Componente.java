/**
 * Interfaz de Componente. Define los atributos que debe poseer cualquier componente
 */
public interface Componente {
    
    /** 
     * @return String nombre del componente
     */
    public String nombre();

    /** 
     * @return String descripcion del componente
     */
    public String descripcion();

    /** 
     * @return double precio del componente
     */
    public double precio();

    /** 
     * @return double ataque del componente
     */
    public double ataque();

    /** 
     * @return double defensa del componente
     */
    public double defensa();

    /** 
     * @return double velocidad del componente
     */
    public double velocidad();

    /** 
     * @return double peso del componente
     */
    public double peso();

    /** 
     * Muestra en terminal el componente
     */
    public void muestraComponente();

}
