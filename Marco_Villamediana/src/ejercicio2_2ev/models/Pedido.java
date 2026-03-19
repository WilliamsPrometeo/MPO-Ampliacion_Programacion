package ejercicio2_2ev.models;

/**
 * Autor: Marco Villamediana
 *
 * Version: 1.0
 */

public class Pedido {
    private String id;
    private String nombreCliente;
    private String plato;
    private double precio;

    /**
     * Constructor clase Pedido
     * @param id
     * @param nombreCliente
     * @param plato
     * @param precio
     */
    public Pedido(String id, String nombreCliente, String plato, double precio) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.plato = plato;
        this.precio = precio;
    }

    /**
     * Getter de atrributo id
     * @return
     */

    public String getId() {

        return id;
    }

    /**
     * Getter de atrributo nobmreCliente
     * @return
     */

    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Getter de atrributo plato
     * @return
     */

    public String getPlato() {
        return plato;
    }

    /**
     * Getter de atrributo precio
     * @return
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo toString
     * @return
     */

    @Override
    public String toString() {
        return String.format("Id: %s - Nombre: %s - Plato: %s - Precio: %f" ,
                id,
                nombreCliente,
                plato,
                precio);
    }
}
