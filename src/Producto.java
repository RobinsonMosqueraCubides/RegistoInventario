public class Producto {
    private String codigo;
    private String nombre;
    private int stock;

    public Producto(String codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public void entrada(int cantidad) {
        this.stock += cantidad;
    }

    public void salida(int cantidad) {
        if (cantidad <= stock) {
            this.stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente");
        }
    }

    public int getStock() {
        return stock;
    }
}
