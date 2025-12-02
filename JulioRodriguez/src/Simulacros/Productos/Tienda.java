package Simulacros.Productos;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> catalogo;

    public Tienda() {
        catalogo = new ArrayList<>();
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    public void añadirProducto(Producto producto) {
        catalogo.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : catalogo) {
            System.out.println(producto);
        }
    }

    public void buscarPorCategoria(String categoria) {
        for (Producto producto : catalogo) {
            if (producto.getCategoria().equals(categoria)) {
                System.out.println(producto);
            }
        }
    }

    public void buscarPorPrecio(double min, double max) {
        for (Producto producto : catalogo) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                System.out.println(producto);
            }
        }

    }

}



