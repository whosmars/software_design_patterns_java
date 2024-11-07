public class LaserSimple extends Arma{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Laser Simple";
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
        return "Laser simple con capacidad destructiva de naves pequeñas con blindaje simple. Capaz de viajar a distancias cortas en poco tiempo";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 1000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 300;
    }
    
}
