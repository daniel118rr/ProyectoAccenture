package ventas;

import almacen.*;

public class Ventas {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345", "Juan", "carrera 11# 14-08");
        System.out.println(cliente1);
        
        Producto producto1 = new Producto("Camiseta", 40000);
        Producto producto2 = new Producto("Pantalon", 45000);
        
        Pedido pedido1 = new Pedido();
        pedido1.agregarProductos(producto1);
        pedido1.agregarProductos(producto2);
        
        pedido1.mostrarOrden();
    }
}
