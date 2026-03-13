package gestionpedidos.models;

public class Pedido {

    private String id;
    private String nombre_cliente;
    private String plato;
    private double precio;

    /**
     *
     * @param id establece el id del pedido
     * @param nombre_cliente establece el nombre del cliente
     * @param plato establece el nombre del plato
     * @param precio establece el precio del pedido
     */
    public Pedido(String id, String nombre_cliente, String plato, double precio) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.plato = plato;
        this.precio = precio;
    }

    /**
     * Getter id
     * @return devuelve el id
     */
    public String getId() {
        return id;
    }

    /**
     * getter nombre_cliente
     * @return devuelve el nombre del cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * getter del plato
     * @return devuelve el plato
     */
    public String getPlato() {
        return plato;
    }

    /**
     * getter precio
     * @return devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * metodo tostring
     * @return devuelve el pedido formateado
     */
    @Override
    public String toString() {
        return String.format("Id: %s - Nombre: %s - Plato: %s - Precio: %2f",
                id,
                nombre_cliente,
                plato,
                precio
        );
    }
}
