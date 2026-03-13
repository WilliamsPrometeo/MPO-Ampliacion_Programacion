package segundaevaluacion.intentoMVC;

import recursos.MyScanner;
import segundaevaluacion.intentoMVC.controller.PedidoController;

public class Main {
    private static final MyScanner sc = new MyScanner();
    private static final PedidoController pedidoController = new PedidoController();

    public static void main(String[] args) {menu();}


    private static void menu() {
        int opcion;
        do {
            opcion = sc.pedirNumero("==== Pedidos ====" +
                    "\n1. Registrar pedido" +
                    "\n2. Mostrar pedidos" +
                    "\n3. Guardar en fichero" +
                    "\n4. Cargar desde fichero" +
                    "\n5. Salir" +
                    "\nOpcion: ");
            switch (opcion) {
                case 1:
                    pedidoController.addPedido();
                    break;
                case 2:
                    pedidoController.mostrarPedidos();
                    break;
                case 3:
                    pedidoController.guardar();
                    break;
                case 4:
                    pedidoController.cargar();
                    break;
                case 5:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
}
