public class ViajeInterplanetario extends SistemaDePropulsion{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Viaje Interplanetario";
    }


    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public String descripcion() {
        return "Sistema de Propulsion planeado para realizar viajes entre planetas dentro de una misma galaxia";
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
        return 100000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 1500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 10000;
    }
    
}
