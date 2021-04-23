package almacen;

public class Pedido {

    private int idPedido;
    private Producto productos[];
    private static int contadorPedidos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private final double DOMICILIO = 7000;

    public Pedido() {
        this.idPedido = ++contadorPedidos;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto) {
        if (contadorProductos < MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha alcanzado el maximo de producotos: " + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        double iva = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }

        if (total > 70000 && total < 100000) {
            iva = total * 0.19;
            total += iva + DOMICILIO;
        } else if (total > 100000) {
            iva = total * 0.19;
            total += iva;
        } else {
            System.out.println("La suma total debe ser mayor a 70.000, actualmente es: " + total);
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Pedido #: " + idPedido);
        System.out.println("Numero de productos: " + contadorProductos);
        System.out.println("Los productos del pedido son: ");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("El total del pedido es: " + calcularTotal());
    }
}
