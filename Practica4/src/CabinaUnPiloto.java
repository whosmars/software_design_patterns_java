public class CabinaUnPiloto extends Cabina {

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Cabina 1 Piloto";
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
        return "Cabina chica con espacio para el piloto";
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 300;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 5000;
    }
    
}
