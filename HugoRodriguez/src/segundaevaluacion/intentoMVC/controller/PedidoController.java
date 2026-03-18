package segundaevaluacion.intentoMVC.controller;

import recursos.MyScanner;
import segundaevaluacion.intentoMVC.service.PedidoService;
import segundaevaluacion.intentoMVC.models.Pedido;

public class PedidoController {
    private static final MyScanner sc = new MyScanner();
    private static final PedidoService pedidoService = new PedidoService();

    public void addPedido() {
        boolean correcto;
        do {
            correcto = true;
            String id = getId();
            Pedido pedido = pedidoService.getPedido(id);
            if (pedido != null) {
                System.out.println("El id ya está asociado a un pedido.");
                correcto = false;
            } else {
                String nombreCliente = sc.pideTexto("Introduce el nombre del cliente: ");
                String plato = sc.pideTexto("Introduce el plato: ");
                double precio = sc.pedirDecimal("Introduce el precio: ");
                pedidoService.addPedido(new Pedido(id, nombreCliente, plato, precio));
                System.out.println("Pedido registrado correctamente.");
            }
        } while (!correcto);
    }

    public void mostrarPedidos() {
        for (Pedido pedido : pedidoService.getPedidos()) {
            System.out.println(pedido);
        }
    }

    public void cargar() {
        pedidoService.cargar();
    }

    public void guardar() {
        pedidoService.guardar();
    }


    private String getId() {
        String regex = "^[A-Z]{3}[0-9]{2}$";
        String id;
        do {
            id = sc.pideTexto("Introduce el id, 3 letras y 2 números: ").toUpperCase();
        } while (!id.matches(regex));
        return id;
    }




}
