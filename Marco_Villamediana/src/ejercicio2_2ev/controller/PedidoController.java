package ejercicio2_2ev.controller;

import recursos.MyScanner;
import ejercicio2_2ev.models.Pedido;
import ejercicio2_2ev.service.PedidoService;

public class PedidoController {
    private static final MyScanner sc =  new MyScanner();
    private static final PedidoService service = new PedidoService();

    public void agregarPedido() {
        boolean correcto;
        do {
            correcto = true;
            String id = getId();
            Pedido pedido = service.getPedido(id);
            if (pedido != null) {
                System.out.println("El codigo ya está asociado a un libro.");
                correcto = false;
            } else {
                String nombre = sc.pideTexto("Introudzca su nombre: ");
                String plato = sc.pideTexto("Introudzca su plato: ");
                int precio;
                do {
                    precio = sc.pedirNumero("Introudzca su precio: ");
                    if (precio <= 0) {
                        System.out.println("El precio debe ser mayor o igual a 0");
                    }
                } while (precio <= 0);
                service.agregarPedido(new Pedido(id, nombre, plato, precio));
                System.out.println("Pedido registrado correctamente.");
            }
        } while (!correcto);
    }


    public void mostrarPedidos(){
        for (Pedido pedido : service.getPedidos()){
            System.out.println(pedido);
        }
    }

    public void cargar(){
        service.cargar();
    }

    public void guardar(String ruta){
        service.guardar(ruta);
    }

    private String getId() {
        String regex = "^[A-Z]{3}[0-9]{2}$";
        String codigo;
        do {
            codigo = sc.pideTexto("Introduce el código, 3 letras y 2 números: ").toUpperCase();
        } while (!codigo.matches(regex));
        return codigo;
    }
}
