package Simulacros.Productos;

public class GestorProductos {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        Producto p1 = new Producto("Lechuga", "Vegetales", 2.50);
        Producto p2 = new Producto("Manzana", "Fruta", 3.00);
        Producto p3 = new Producto("Sprite", "Bebidas", 1.50);
        Producto p4 = new Producto("BlackLabel", "Bebidas", 7.10);
        Producto p5 = new Producto("Pera", "Fruta", 5.25);

        tienda.añadirProducto(p1);
        tienda.añadirProducto(p2);
        tienda.añadirProducto(p3);
        tienda.añadirProducto(p4);
        tienda.añadirProducto(p5);

        System.out.println("===Gestor de Productos===");
        tienda.listarProductos();

        System.out.println("\n===Producto por Categoría Bebidas===");
        tienda.buscarPorCategoria("Bebidas");

        System.out.println("\n===Producto mayor a 2.00€ y menor a 5.00€");
        tienda.buscarPorPrecio(2.00, 7.00);

    }
}
