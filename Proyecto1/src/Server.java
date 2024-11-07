import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase Server. Encargada de dirigir el buen funcionamiento de todo el programa
 * asi como de todos los patrones de Diseno ocupados
 */
public class Server implements Sujeto {

  public LinkedList<Cliente> clientes;
  public TiendaVirtualInterface tienda;
  public Catalogo catalogo;
  public CarritoDeCompras carrito;
  public double descuento = 0.00;

  private final double[] OFERTAS = { 1.00, 0.95, 1.00, 0.90, 1.00, 0.85, 1.00, 0.80, 1.00, 0.75 };

  public Server() {
    this.clientes = new LinkedList<Cliente>();
    this.tienda = new TiendaVirtualEspanol();
    this.catalogo = new Catalogo();
    this.descuento = this.generarDescuento();
    this.clientes.add(new Cliente("Mario",
        "Mario Bross",
        "Mario123",
        "Mario wolrd",
        "5539857210",
        "55467110",
        "mexico",
        this.tienda,
        521212.0,
        this));

    this.clientes.add(new Cliente("Donkey",
        "Donkey Kong",
        "Donkey23",
        "Mario wolrd",
        "5539857110",
        "55467210",
        "estados unidos",
        this.tienda,
        123424.0,
        this));

    this.clientes.add(new Cliente("Moises",
        "Moi",
        "Hola123",
        "Ecatepunk",
        "5539857310",
        "55467310",
        "espana",
        this.tienda,
        1213031.0,
        this));
    agregaProductosPrueba();
  }

  /**
   * @return TiendVirtualInterface regresa la TiendaVirtual actual del Server
   */
  public TiendaVirtualInterface getTienda() {
    return this.tienda;
  }

  /**
   * Cambia el idioma de la TiendaVirtual a traves de Strategy
   */
  public void cambiarIdioma(Cliente cliente) {
    ClienteProxy clienteProxy = new ClienteProxy(cliente);
    switch (clienteProxy.getPaisOrigen().toLowerCase()) {
      case "mexico":
        this.tienda = new TiendaVirtualEspanol();
        break;
      case "estados unidos":
        this.tienda = new TiendaVirtualIngles();
        break;
      case "espana":
        this.tienda = new TiendaVirtualCastellano();
        break;
      default:
        break;
    }
    System.out.println(this.tienda.getIdTienda());
  }

  /**
   * Metodo que despliega los menus a usar al realizar una compra
   * 
   * @param cliente Cliente con el que se interactua
   */
  public void comprar(Cliente cliente) {
    CatalogoProxy catalogoProxy = new CatalogoProxy(this.catalogo);
    ClienteProxy clienteProxy = new ClienteProxy(cliente);
    CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
    Scanner sc = new Scanner(System.in);
    int opcionWhile = 100;
    int opcionCatalogoCompra = 1000;
    while (opcionCatalogoCompra != 100) {
      System.out.println(this.tienda.mostrarMenuOpciones());
      opcionCatalogoCompra = sc.nextInt();
      if (opcionCatalogoCompra == 1) {
        catalogoProxy.mostrarProductos();
      } else if (opcionCatalogoCompra == 2) {
        catalogoProxy.mostrarProductos();
        opcionCatalogoCompra = 100;
      } else {
        System.out.print(this.tienda.logout());
        opcionCatalogoCompra = 100;
        opcionWhile = 1;
      }
    }

    while (opcionWhile == 100) {
      System.out.println(this.tienda.mostrarCatalogo(catalogo));
      System.out.println(this.tienda.salir(12) + "\n" + this.tienda.removerCarrito(13));
      int opcion = sc.nextInt();
      switch (opcion) {
        case 13:
          carritoDeCompras.removerProductos();
          this.clientes.remove(cliente);
          opcionWhile = 1;
          opcionCatalogoCompra = 100;
          break;
        case 1:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoAspiradora()));
          break;
        case 2:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoCelular()));
          break;
        case 3:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoEstufa()));
          break;
        case 4:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoFreidora()));
          break;
        case 5:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoHuevo()));
          break;
        case 6:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoLaptop()));
          break;
        case 7:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoLavadora()));
          break;
        case 8:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoLeche()));
          break;
        case 9:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoLlanta()));
          break;
        case 10:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoPantalla()));
          break;
        case 11:
          carritoDeCompras.agregarProducto(this.catalogo.getProducto(new ProductoPizza()));
          break;
        case 12:
          System.out.println(this.tienda.costoTotal(carritoDeCompras.costoTotalCarrito()));
          System.out.println(this.tienda.pagarCuenta("******553"));
          String cuentaBancaria = sc.nextLine();
          cuentaBancaria = sc.nextLine();

          if (clienteProxy.compararCuentas(cuentaBancaria)) {
            if (clienteProxy.getFondos() >= carritoDeCompras.costoTotalCarrito()) {
              System.out.println(this.tienda.datosCorrectos());
            } else {
              System.out.println(this.tienda.fondosInsuficientes());
              System.exit(0);
            }
          } else {
            System.out.println(this.tienda.datosIncorrectos());
            System.exit(0);
          }
          System.out.println(this.tienda.fechaEnvio("09/11/2022"));
          System.out.println(this.tienda.despedirse());
          System.exit(0);
          opcionWhile = 1;
          break;
        default:
          break;
      }
    }
  }

  /**
   * Metodo que simula la agregancia de clientes al Server
   */
  public void agregaClientesPrueba() {
    this.clientes.add(new Cliente("Mario",
        "Mario Bross",
        "Mario123",
        "Mario wolrd",
        "5539857210",
        "55467110",
        "mexico",
        this.tienda,
        521212.0,
        this));

    this.clientes.add(new Cliente("Donkey",
        "Donkey Kong",
        "Donkey23",
        "Mario wolrd",
        "5539857110",
        "55467210",
        "estados unidos",
        this.tienda,
        123424.0,
        this));

    this.clientes.add(new Cliente("Moises",
        "Moi",
        "Hola123",
        "Ecatepunk",
        "5539857310",
        "55467310",
        "espana",
        this.tienda,
        1213031.0,
        this));
  }

  /**
   * Metodo que simula la agregancia de Productos al Catalogo
   */
  public void agregaProductosPrueba() {
    this.catalogo.agregarProducto(new ProductoAspiradora());
    this.catalogo.agregarProducto(new ProductoCelular());
    this.catalogo.agregarProducto(new ProductoEstufa());
    this.catalogo.agregarProducto(new ProductoFreidora());
    this.catalogo.agregarProducto(new ProductoHuevo());
    this.catalogo.agregarProducto(new ProductoLaptop());
    this.catalogo.agregarProducto(new ProductoLavadora());
    this.catalogo.agregarProducto(new ProductoLeche());
    this.catalogo.agregarProducto(new ProductoLlanta());
    this.catalogo.agregarProducto(new ProductoPantalla());
    this.catalogo.agregarProducto(new ProductoPizza());
  }

  /**
   * Metodo que agrega productos al catalogo
   * 
   * @param producto Producto que se agrega
   */
  public void agregaProducto(Producto producto) {
    this.catalogo.agregarProducto(producto);
    return;
  }

  /**
   * Metodo que remueve productos al catalogo
   * 
   * @param producto Producto que se remueve
   */
  public void remueveProducto(Producto producto) {
    this.catalogo.removerProducto(producto);
  }

  /**
   * Metodo que agrega clientes al server
   * 
   * @param cliente Cliente que se agrega
   */
  public void agregaCliente(Cliente cliente) {
    this.clientes.add(cliente);
    return;
  }

  /**
   * Metodo que remueve clientes al server
   * 
   * @param cliente Cliente que se remueve
   */
  public void remueveCliente(Cliente cliente) {
    clientes.remove(cliente);
  }

  /**
   * Metodo que remueve clientes al server
   * 
   * @param String nombre deCl liente que se remueve
   */
  public void remueveCliente(String nombre) {
    for (int i = 0; i < clientes.size(); i++) {
      if (nombre == clientes.get(i).getNombre()) {
        clientes.remove(i);
      }
    }
  }

  /**
   * @return cliente cliente con el que se logeo
   * @param nombre     nombre del cliente
   * @param contrasena contrasena del cliente
   */
  public Cliente login(String nombre, String contrasena) {
    for (Cliente c : this.clientes) {
      if (c.getNombreUsuario().equals(nombre) && c.getContrasena().equals(contrasena)) {
        return c;
      }
    }
    return null;
  }

  /**
   * @return boolean coincidencia de datos a pasar con atributos del cliente
   * @param nombre     nombre del cliente
   * @param contrasena contrasena del cliente
   */
  public boolean usuarioContrasena(String usuario, String contrasena) {
    for (Cliente c : this.clientes) {
      if (c.getNombreUsuario().equals(usuario) && c.getContrasena().equals(contrasena))
        return true;
    }
    return false;
  }

  /**
   * @return double el descuento que se aplicara
   */
  public double generarDescuento() {
    Random random = new Random();
    int numeroRandom = 0;
    double descuento = 0.00;
    numeroRandom = random.nextInt(OFERTAS.length);
    descuento = OFERTAS[numeroRandom];
    return descuento;
  }

  /**
   * @return double el descuento que se aplica
   */
  public double getDescuento() {
    return this.descuento;
  }

  /**
   * Notifica a todos los clientes sobre los descuentos. Parte del patron Observer
   */
  public void notificar() {
    if (clientes.size() > 0) {
      for (Cliente c : clientes) {
        if (descuento != 1.00) {
          this.catalogo.aplicarDescuento(this.descuento);
          c.setBandeja(c.getNombre() + ", Se ha aplicado un descuento del " + ((1 - descuento) * 100)
              + " por ciento a todos los productos de la tienda");
        } else {
          c.setBandeja("No hay descuento disponibles");
        }

      }
    }
  }

}