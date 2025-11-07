public class Alumno {
    //Atributos
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notafinal;

    //Constructor
    public Alumno(String nombre, double nota1,  double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    //getter and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    //Metodo para calcular la media
        public double calcularMedia () {

        return (nota1 + nota2 + nota3) / 3;
    }

        //Metodo para mostar el resumen
        public void MostrarResumen () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota de base de datos: " + nota1);
        System.out.println("Nota de programación: " + nota2);
        System.out.println("Nota de entornos: " + nota3);

        System.out.println("Media: " + calcularMedia());
        //Bucle para controlar si has aprobado o suspendido
        if (calcularMedia() >= 5 && calcularMedia() <= 10) {
            System.out.println("Has aprobado");
        } else System.out.println("No has aprobado");

    }

    }

