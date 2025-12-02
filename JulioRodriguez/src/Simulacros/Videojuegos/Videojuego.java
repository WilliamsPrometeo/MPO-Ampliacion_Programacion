package Simulacros.Videojuegos;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int horas;

    public Videojuego(String nombre, String plataforma, int horas) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Plataforma: %s | Horas: %d", nombre, plataforma, horas);
    }


}
