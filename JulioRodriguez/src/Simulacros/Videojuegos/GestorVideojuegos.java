package Simulacros.Videojuegos;

public class GestorVideojuegos {
    public static void main(String[] args) {

        ColeccionJuegos coleccionJuegos = new ColeccionJuegos();

        Videojuego j1 = new Videojuego("God of War", "PlayStation", 25);
        Videojuego j2 = new Videojuego("Zelda BOTW", "Nintendo Switch", 80);
        Videojuego j3 = new Videojuego("The Witcher 3", "PC", 100);
        Videojuego j4 = new Videojuego("Hades", "PC", 20);

        coleccionJuegos.añadirJuego(j1);
        coleccionJuegos.añadirJuego(j2);
        coleccionJuegos.añadirJuego(j3);
        coleccionJuegos.añadirJuego(j4);

        System.out.println("====VIDEOJUEGOS===");
        coleccionJuegos.listarJuegos();

        System.out.println("\n===BUSCAR JUEGOS PARA PC===");
        coleccionJuegos.buscarPorPlataforma("PC");

        System.out.println("\n===JUEGOS ENTRE 20 y 60 HORAS===");
        coleccionJuegos.buscarPorDuracion(80, 100);
        System.out.println("==============");


    }
}
