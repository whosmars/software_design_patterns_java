public class ViajeIntercontinental extends SistemaDePropulsion{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre(){
        return "Viaje Intercontinental";
    }

    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public String descripcion(){
        return "Sistema de Propulsion planeado para un viaje entre continentes de un mismo planeta";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque(){
        return 0;
    }

    
    /** 
     * @return double defensa del componente
     */
    @Override
    public double defensa(){
        return 0;
    }

    
    /** 
     * @return double velocidad del componente
     */
    @Override
    public double velocidad(){
        return 10000;
    }

    
    /** 
     * @return double preso del componente
     */
    @Override
    public double peso(){
        return 500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio(){
        return 10000;
    }

}
