import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
/**
 * Clase encargada de serializar y de crear los archivos .txt asociados a cada expectador
 */
public class Bitacora{

    /** 
     * Crea el archivo txt donde se guardara la info
     * @param nombreArchivo - El nombre del archivo txt donde se guardara la info del evente asignada a cada usuario
     * @param espectador - Nombre del espectador asociado al archivo
     * @param jugadorFav - Personaje favorito del espectador
     */
    public void crearArchivo(String nombreArchivo, String espectador, String jugadorFav){
        try{
            FileWriter fw = new FileWriter(nombreArchivo, true);
            fw.write ("Bienvenido " + espectador + ", te has unido a Luchas Clandestinas 2022. \nElegiste de luchador a: "+ jugadorFav);
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return;
    }

    
    /** 
     * Actualiza el archivo txt donde se guarda lo ocurrido en la batalla
     * @param nombreArchivo - El nombre del archivo txt donde se guardara la info del evente asignada a cada usuario
     * @param sucesos - Sucesos ocurridos en el combato de Arena, se serializara esta info
     */
    public void grabar(String nombreArchivo, String sucesos){
        try{
            FileWriter fw = new FileWriter(nombreArchivo, true);    
            fw.write(sucesos + "\n");
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return;
    }

}