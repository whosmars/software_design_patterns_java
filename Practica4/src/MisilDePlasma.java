public class MisilDePlasma extends Arma {

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Misil de Plasma";
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
        return "Misil dirigido de plasma con capacidad de derretir cubiertas asi como de aumentar el calor de la nave que se atacó";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 3000;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 4500;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 650;
    }
    
}
