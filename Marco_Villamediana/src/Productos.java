import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Productos {
    private static final MyScanner sc = new MyScanner();
    public static void main(String args[]) {


        ArrayList<String> productos = new ArrayList<>();

        productos.add("Tomate");
        productos.add("Hamburguesa");
        productos.add("Pan");
        productos.add("Coca Cola");
        productos.add("Pizza");

        Map<String, Double> mapa = new HashMap<>();

        for (String producto: productos) {
            mapa.put(producto, sc.pedirDecimal("Indique el precio de " + producto +": "));
        }

        System.out.println("PRODUCTOS");

        for (String key: mapa.keySet()) {
            System.out.println(key + ": " + mapa.get(key));
        }
    }
}
