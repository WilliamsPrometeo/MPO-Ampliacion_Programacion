public class Alumno {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String calificacion;

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public double getMedia() {
        return media;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double comprobarNotas1() {
        boolean bien1;
        do {

            nota1 = getNota1();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota no válida. indique una nota del 0 al 10");
                bien1 = false;

            } else {
                bien1 = true;
            } return nota1;
        } while (!bien1);
    }
    public double comprobarNotas2() {
        boolean bien2;
        do {
            nota2 = getNota2();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota no válida. indique una nota del 0 al 10");
                bien2 = false;
            } else {
                bien2 = true;
            }return nota2;
        } while (!bien2);
    }
    public double comprobarNotas3() {
        boolean bien3;
        do {

            nota3 = getNota3();
            if (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota no válida. indique una nota del 0 al 10");
                bien3 = false;
            } else  {
                bien3 = true;
            }return nota3;
        }  while (!bien3);
    }
    public void calcularMedia() {
        boolean valido;
        do {
            double media = (nota1 + nota2 + nota3) / 3;
            if (media >= 5) {
                setCalificacion("Aprobado");
                setMedia(media);
                valido = false;
            } else if (media <=10){
                setCalificacion("Suspenso");
                setMedia(media);
                valido = false;
            } else {
                valido = true;
            }

        }while (valido);
    }

    public void mostrarAlumno(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nota1: " + getNota1());
        System.out.println("Nota2: " + getNota2());
        System.out.println("Nota3: " + getNota3());
        System.out.println("Media: " + getMedia());
        System.out.println("Calificacion: " + getCalificacion());
    }
}
