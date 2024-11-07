public class CabinaEjercito extends Cabina {

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Cabina Ejercito";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 0;
    }

    
    /** 
     * @return double defensa del componente
     */
    @Override
    public double defensa() {
        return 0;
    }

    
    /** 
     * @return double velocidad del componente
     */
    @Override
    public double velocidad() {
        return 0;
    }

    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public String descripcion() {
        return "Cabina grande con espacio para un ejercito galactico de tamanio considerable";
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 6200;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 100000;
    }
    
}