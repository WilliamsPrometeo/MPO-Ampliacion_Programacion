package Simulacros.Videojuegos;

import java.util.ArrayList;

public class ColeccionJuegos {
    private ArrayList<Videojuego> juegos;

    public ColeccionJuegos() {
        juegos = new ArrayList<>();
    }

    public ArrayList<Videojuego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Videojuego> juegos) {
        this.juegos = juegos;
    }

    public void añadirJuego(Videojuego videojuego) {
        juegos.add(videojuego);
    }

    public void listarJuegos() {
        for (Videojuego videojuego : juegos) {
            System.out.println(videojuego);
        }
    }

    public void buscarPorPlataforma(String plataforma) {
        for (Videojuego videojuego : juegos) {
            if (videojuego.getPlataforma().equals(plataforma)) {
                System.out.println(videojuego);
            }

        }
    }

    public void buscarPorDuracion(int min, int max) {
        for (Videojuego videojuego : juegos) {
            if (videojuego.getHoras() >= min && videojuego.getHoras() >= max) {
                System.out.println(videojuego);
            }

        }
    }

}
