import java.util.Scanner;

public class Vista {
  
    public Controlador controlador;


    public Vista(){
        this.controlador = new Controlador(this);
    }

    
    /** 
     * @param nombre bienvenida que recibira el usuario con este nombre
     */
    public void mensajeBienvenida(String nombre){
        showMensaje("Hola " +  nombre + "! bienvenido a Cultura UNAM la aplicacion que te muestra la oferta cultural de la universidad");
    }

    public void login(){
      showMensaje("Ingresa tu numero de cuenta:");
      String email  = leerEntradaString();
      showMensaje("Ingresa tu password:");
      String password = leerEntradaString();
      controlador.login(email, password);
    }

    public void logOut(){
        mensajeSalida();
    }

    private void mensajeSalida() {
        showMensaje("Nos vemos pronto!");
    }

    
    /** 
     * @param s mensaje a mostrar
     */
    public void  showMensaje(String s){
        System.out.println(s);
    }

    
    /** 
     * @return int entrada leida por el Scanner
     */
    public int leerEntradaEntero(){
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }

    
    /** 
     * @return String entrada leida por el Scanner
     */
    public String leerEntradaString(){
        Scanner scanner =  new Scanner(System.in);
        String s = scanner.next();
        return s.trim().toLowerCase();
    }
}
