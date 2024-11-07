import java.io.IOException;
import java.util.Scanner;

/**
 * Clase Main. Contiene el metodo main que ayuda a correr el programa terminal
 */
public class Main {
  
  /**
   * @param args argumentos por terminal. Son opcionales
   */
  public static void main(String[] args) throws IOException {
    login();
  }

  public static void login() throws IOException {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Ingresa el nombre de usuario si deseas salir escribe exit:");
      String usuario = sc.nextLine();
      if (usuario.equalsIgnoreCase("exit")) {
        System.out.println("Adios, buen día!");
        System.exit(0);
      }
      System.out.println("hola " + usuario + ", Ingresa tu contraseña:");
      checarContrasena(usuario);
    }
  }

  public static void checarContrasena(String usuario) {
    Server server = new Server();
    Scanner sc = new Scanner(System.in);
    String contrasena = sc.nextLine();
    boolean validar = server.usuarioContrasena(usuario, contrasena);
    if (validar) {
      server.generarDescuento();
      server.notificar();
      Cliente cliente = server.login(usuario, contrasena);
      System.out
          .println("Hola " + cliente.nombre + "!," + "Hoy tienes el siguiente descuento:" + "\n" + cliente.bandeja);
      server.cambiarIdioma(cliente);
      server.comprar(cliente);
    } else {
      System.out.println("Tus datos son incorrectos");
    }
  }

}