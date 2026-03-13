package gestionpedidos.controller;

import gestionpedidos.exception.PedidosException;
import gestionpedidos.models.Pedido;
import gestionpedidos.recursos.MyScanner;
import gestionpedidos.service.PedidoService;

public class PedidoController {


        private static final MyScanner sc = new MyScanner();
        private static final PedidoService service = new PedidoService();

        public void agregarPedido() {
            boolean correcto;
            try {
                do {

                    correcto = true;
                    String id = getId();
                    Pedido pedido =service.getPedido(id);
                    if ( pedido != null) {
                        correcto = false;
                        System.out.println("El id existe en el sistema");

                    } else {
                        String nombre = sc.pideTexto("Introudce el nombre: ");
                        String plato = sc.pideTexto("Introudce el plato: ");
                        Double precio = sc.pedirDecimal("Introudce el precio: ");
                        service.agregarPedido(new Pedido(id,nombre,plato,precio));
                        System.out.println("Pedido registrado correctamente.");
                    }
                } while (!correcto);
            } catch (PedidosException e) {
                System.out.println(e.getMessage());
            }
        }

        public void mostrarPedidos() {
            for (Pedido pedido : service.getPedidos()) {
                System.out.println(pedido);
            }
        }

        public void cargar() {
            service.cargar();
        }

        public void guardar() {
            service.guardar();
        }

        private String getId() {
            String regex = "^[A-Z]{3}[0-9]{2}$";
            String id;
            do {
                id = sc.pideTexto("Introduce el código, 3 letras y 2 números: ").toUpperCase();
            } while (!id.matches(regex));
            return id;
        }
}

