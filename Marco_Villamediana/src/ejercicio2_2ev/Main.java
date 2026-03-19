package ejercicio2_2ev;

import ejercicio2_2ev.controller.PedidoController;
import ejercicio2_2ev.models.Pedido;
import recursos.MyScanner;

public class Main {
    private static final MyScanner sc =  new MyScanner();
    private static final PedidoController controller = new PedidoController();

    public static void main(String[] args) { menu();}

    private static void menu() {
        int opcion;
        do{
            opcion = sc.pedirNumero("==== GESTION DE PEDIDOS ====" +
                    "\n1. Registrar pedido" +
                    "\n2. Mostrar pedidos" +
                    "\n3. Guardar pedidos en fichero" +
                    "\n4. Cargar pedidos desde fichero" +
                    "\n5. Salir");
            switch(opcion){
                case 1:
                    controller.agregarPedido();
                    break;
                case 2:
                    controller.mostrarPedidos();
                    break;
                case 3:
                    controller.guardar("/Desktop/DAW/Práctica6");
                    break;
                case 4:
                    controller.cargar();
                    break;
                case 5:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while(opcion!=5);
    }
}
