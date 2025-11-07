package Simulacros;

public class Alumno {

    private String nombre;
    private String asignatura1;
    private String asignatura2;
    private String asignatura3;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String nombre, String asignatura1, String asignatura2, String asignatura3, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(String asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public String getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public String getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(String asignatura3) {
        this.asignatura3 = asignatura3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calificacionGlobal() {
        boolean aprobado;
        if (!aprobado) {
            if ((nota1 + nota2 + nota3) / 3 < 5.0) {
                System.out.println("Suspenso");
            } else {
                aprobado = true;
            }
        }


        public void mostrarCalculo() {
            System.out.println();
            System.out.println("===== CONTROL DE NOTAS ====");
            System.out.println("Nombre: " + nombre);
            System.out.println("Asignatura1: " + asignatura1);
            System.out.println("Asigantura2: " + asignatura2);
            System.out.println("Asigantura3: " + asignatura3);
            System.out.println("Nota1: " + nota1);
            System.out.println("Nota2: " + nota2);
            System.out.println("Nota3: " + nota3);
            System.out.println("Calificación Global: " + calificacionGlobal());
            System.out.println("================================");
        }


    }
