import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainAsignatura {
    private static final MyScanner sc = new MyScanner();
    static int cantidad = 2;
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public static void main(String args[]) {
        pedirAsignatura();
        Map<String, Asignatura> mapa = new HashMap<>();
        for (Asignatura asignatura : asignaturas) {
            mapa.put(asignatura.getNombre() , asignatura);

        }

        for (String key: mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

        String clave = sc.pedirSoloTexto("Ingrese el nombre de la asignatura: ");
        boolean existe = mapa.containsKey(clave);
        if (existe) {
            Asignatura asignatura = mapa.get(clave);
            asignatura.setNota(sc.pedirDecimal("Ingrese su nota"));
        } else {
            System.out.println("No existe el nombre de la asignatura");
        }

        for (String key: mapa.keySet()) {
            System.out.println(mapa.get(key));
        }
    }


        public static Asignatura addAsignatura(){
            String nombre = sc.pedirSoloTexto("Introduce el nombre de la asignatura: ");
            double nota= sc.pedirNumero("Introduce la nota: ");

            return new Asignatura(nombre, nota);
        }

        public static void pedirAsignatura(){
        for (int i =0; i < cantidad; i++){
            asignaturas.add(addAsignatura());
        }


    }

}
