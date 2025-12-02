package Práctica;

public class Alumno {
    private String nombre;
    private double n1;
    private double n2;
    private double n3;

    public Alumno(String nombre, double n1, double n2, double n3) {
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double media() {
        return (n1 + n2 + n3) / 3.0;
    }

    public String estadoGlobal() {
        double media = media();
        if (media >= 5.0) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    public void mostrarinformacion() {
        System.out.println("\n--- Resumen de notas ---");
        System.out.printf("Alumno: %s%n", nombre);
        System.out.printf("Programación: %.2f%n", n1);
        System.out.printf("Base de Producto: %.2f%n", n2);
        System.out.printf("Entornos: %.2f%n", n3);
        System.out.printf("Media: %.2f%n", media());
        System.out.println("Promedio final: " + estadoGlobal());
        System.out.println("------------------------");
    }

}
