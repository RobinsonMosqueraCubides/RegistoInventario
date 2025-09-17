public class Reporte {
    public void generarReporte(Producto producto) {
        System.out.println("Reporte de producto:");
        System.out.println("Código: " + producto.getStock());
        System.out.println("Stock actual: " + producto.getStock());
    }
}
