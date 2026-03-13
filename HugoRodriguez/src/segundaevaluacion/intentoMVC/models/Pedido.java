package segundaevaluacion.intentoMVC.models;

/**
 *Clase que representa un pedido, con su id, nombre del cliente, plato y precio.
 * @author Alumnno - Hugo
 * @version 1.0
 */
public class Pedido {
    private String id;
    private String nombreCliente;
    private String plato;
    private double precio;

    /**
     * Constructor de la clase Pedido
     * @param id id del pedido, debe ser 3 letras y 2 números
     * @param nombreCliente nombre del cliente que hace el pedido
     * @param plato plato que se ha pedido
     * @param precio precio del pedido
     */
    public Pedido(String id, String nombreCliente, String plato, double precio) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.plato = plato;
        this.precio = precio;
    }

    /**
     * Getter del id del pedido
     */
    public String getId() {
        return id;
    }

    /**
     * Setter del id del pedido
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter del nombre del cliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Setter del nombre del cliente
     * @param nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Getter del plato pedido
     */
    public String getPlato() {
        return plato;
    }

    /**
     * Setter del plato pedido
     * @param plato
     */
    public void setPlato(String plato) {
        this.plato = plato;
    }

    /**
     * Getter del precio del pedido
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del precio del pedido
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método toString para mostrar la información del pedido de forma legible
     */
    @Override
    public String toString() {
        return String.format("Pedido: %s - Cliente: %s - Plato: %s - Precio: %.2f",
                id,
                nombreCliente,
                plato,
                precio);
    }
}
