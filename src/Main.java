//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario admin = new Usuario("Adriana", "Administrador");
        Producto producto1 = new Producto("P001", "Laptop", 10);

        producto1.entrada(5);
        producto1.salida(3);

        Reporte reporte = new Reporte();
        reporte.generarReporte(producto1);

    }
}