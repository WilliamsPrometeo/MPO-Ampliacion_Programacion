public class ControlNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una nota: ");
        float nota = sc.nextFloat();
    }
}
public static void main(String[] args) {
    int notas;
    int media;
    String clasificacion;
    System.out.println("Ingresa una nota: ");

    while (true) {
        Scanner sc = new Scanner(System.in);
        notas = sc.nextInt();

        if (notas < 0 || notas == 5) {
            System.out.println("Has aprobado pero la proxima vez te tienes que esforzar mas");
        } else if (notas > 5 || notas < 8) {
            System.out.print("Has sacado muy buena nota pero te ha faltado un poco para el diez");
        } else if (notas == 10) {
            System.out.print("Muy bien has sacado un 10");
        } else {
            System.out.println(notas);
        }
    }
}