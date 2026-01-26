package gestion_productos;

/**
 * Clase que representa un inventario de productos con código y precio
 *
 * @author Alumno- Hugo
 * @version 1.0.
 */

public class Inventario {
    private String codigo;
    private double precio;

    /**
     * Constructor por defecto de la clase Inventario.
     */
    public Inventario() {
    }

    /**
     * Getter y Setter para el código del producto.
     */

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para mostrar una representación en cadena del objeto Inventario.
     *
     * @return Una cadena que representa el objeto Inventario.
     */
    @Override
    public String toString() {
        return "Inventario{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
