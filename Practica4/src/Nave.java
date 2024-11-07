import java.util.LinkedList;
/**
 * Clase que define el comportamiento asi como los atributos de una Nave
 */
public class Nave{

	private LinkedList<Componente> componentes = 
					new LinkedList<Componente>();

	
    /** 
     * @param com Componente que se agregara a Nave
     */
    public void agregaComponente(Componente com){
        componentes.add(com);
    }

    
    /** 
     * @return double ataque de la nave
     */
    public double obtenAtaque(){
        double ataque = 0;
        for (Componente com : componentes){
           ataque += com.ataque();
        }		
        return ataque;
    }

    
    /** 
     * @return double defensa de la nave
     */
    public double obtenDefensa(){
        double defensa = 0;
        for (Componente com : componentes){
           defensa += com.defensa();
        }		
        return defensa;
    }


    
    /** 
     * @return double precio de la nave
     */
    public double obtenPrecio(){
        double costo = 0;
        for (Componente com : componentes){
            costo += com.precio();
        }		
        return costo;
    }

    
    /** 
     * @return double velocidad de la nave
     */
    public double obtenVelocidad(){
        double velocidad = 0;
        for (Componente com : componentes){
           velocidad += com.velocidad();
        }		
        return velocidad;
    }

    
    /** 
     * @return double peso de la nave
     */
    public double obtenPeso(){
        double peso = 0;
        for (Componente com : componentes){
           peso += com.peso();
        }		
        return peso;
    }

    public void muestraComponentes() {
        for (Componente com : componentes)
            com.muestraComponente();
    }

    public void muestraNave(){
        System.out.println("Ataque de la nave: " + this.obtenAtaque());
        System.out.println("Defensa de la nave: " + this.obtenDefensa());
        System.out.println("Velocidad de la nave: " + this.obtenVelocidad());
        System.out.println("Peso de la nave: " + this.obtenPeso());
    }

}
