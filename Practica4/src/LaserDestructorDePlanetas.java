public class LaserDestructorDePlanetas extends Arma{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Laser Destructor de Planetas";
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
        return "Laser con capacidad de destruir naves militares. Capaz de destruir pequeñas estrellas o asteroides";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 50000;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 1000000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 900;
    }
    
}
