package almacen;

public class Cliente {
    
    private String idCliente;
    private String nombre;
    private String direccion;
    private static int contadorClientes;
    
    private Cliente(){
        ++contadorClientes;
    }
    
    public Cliente(String idCliente, String nombre, String direccion){
        this();
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
