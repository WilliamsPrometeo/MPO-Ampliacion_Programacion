package gestionpedidos.persistence;

import gestionpedidos.models.Pedido;
import gestionpedidos.recursos.Utilidades;

import java.io.*;
import java.util.ArrayList;

public class PedidoDao {
    private final String RUTA = System.getProperty("user.home") + "/Desktop/DAW/Practica6";
    private final File FILE = new File(RUTA + File.separator + "pedidos.txt");

    public void guardar(ArrayList<Pedido> pedidos) {
        if (comprobarDirectorio(RUTA)) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
                for (Pedido pedido : pedidos) {
                    String linea =
                            pedido.getId() + ";" +
                                    pedido.getNombre_cliente() + ";" +
                                    pedido.getPlato() + ";" +
                                    pedido.getPrecio();
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Pedido guardado exitosamente");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public ArrayList<Pedido> cargar() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        if (FILE.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(";");
                    String id = datos[0];
                    String nombre = datos[1];
                    String plato = datos[2];
                    Double precio = Double.valueOf(datos[3]);
                    pedidos.add(new Pedido(id, nombre, plato,precio));
                }
                System.out.println("Pedido cargado exitosamente");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return pedidos;
    }

    private static boolean comprobarDirectorio(String ruta) {
        if (Utilidades.existDirectory(ruta)) {
            return true;
        } else {
            return Utilidades.crearDirectorio(ruta);
        }
    }

}
