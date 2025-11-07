public class Alumno {
    //Atributos
    private String nombre;
    private int notas;
    private int media;
    private String clasificacion;

    //Constructo
    public Alumno(String nombre, int notas, int media, String clasificacion) {
        this.nombre = nombre;
        this.notas = notas;
        this.media = media;
        this.clasificacion = clasificacion;
    }

    public void motrasAlumno() {
        System.out.println("Alumno: " + this.nombre);
        System.out.println("Notas: " + this.notas);
        System.out.println("Media: " + this.media);
        System.out.println("Clasificacion: " + this.clasificacion);
    }

}
