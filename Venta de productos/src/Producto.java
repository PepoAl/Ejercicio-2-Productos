import java.util.ArrayList;

public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    public String getNombre(){
        return nombre;
    }
    public float getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
}

class Inventario {
    private List<Producto>productos;

    public Inventario(){
        productos = new ArrayList<>();
    }
    public void agregarProducto(String nombre, float precio, int cantidad){
        productos.add(new Producto(nombre, precio, cantidad));
    }
    public void mostrarProductos(){
        for (Producto producto : productos){
            System.out.println("Nombre: "+ producto.getNombre() +
                    "Precio: " + producto.getPrecio() +
                    "Cantidad" + producto.getCantidad());

        }
    }
}

class Venta {
    private String nombreProducto;
    private int cantidadVendida;
    private float precioTotal;

    public Venta(String nombreProducto, int cantidadVendida, float precioTotal){
        this.nombreProducto = nombreProducto;
        this.cantidadVendida = cantidadVendida;
        this.precioTotal =  precioTotal;
    }
}

class Ventas {
    private
}