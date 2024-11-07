public class BlindajeSimple extends Blindaje{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Blindaje Simple";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
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
        return "Blindaje simple de nave pensado para naves de uso no belicas";
    }

    
    /** 
     * @return double defensa del componente
     */
    @Override
    public double defensa() {
        return 1000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 1000;
    }
    
}
