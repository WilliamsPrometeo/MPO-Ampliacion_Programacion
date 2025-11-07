public class Alumno {
    //Atributos
    private String alumno;
    private double Nota1;
    private double Nota2;
    private double Nota3;

    //Constructor
    public Alumno(double nota1, double nota2, double nota3) {
        this.alumno = alumno;
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
    }

    //Getter y Setters

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        Nota3 = nota3;
    }


    //Metodos

    //Metodo calcular media
    public double CalcularMedia(){
        double sumaTotal = Nota1 + Nota2 + Nota3;
        return sumaTotal / 3;
    }

    //Metodo mostrar informacion
    public void MostrarResumen(){
        System.out.println("------Resumen Notas------");
        System.out.println("Alumno: " + alumno);
        System.out.println("Nota1: " + Nota1);
        System.out.println("Nota2: " + Nota2);
        System.out.println("Nota3: " + Nota3);
        System.out.println("Media: " + CalcularMedia());
    }

}