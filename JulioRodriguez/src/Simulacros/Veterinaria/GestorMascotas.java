package Simulacros.Veterinaria;

public class GestorMascotas {
    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        Mascota mascota1 = new Mascota("Luna", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);
        Mascota mascota3 = new Mascota("Toby", "Perro", 7);
        Mascota mascota4 = new Mascota("Nube", "Conejo", 1);
        Mascota mascota5 = new Mascota("Rocky", "Perro", 10);

        clinica.añadirMascotas(mascota1);
        clinica.añadirMascotas(mascota2);
        clinica.añadirMascotas(mascota3);
        clinica.añadirMascotas(mascota4);
        clinica.añadirMascotas(mascota5);

        System.out.println("====MASCOTAS REGISTRADAS===");
        clinica.listarMascotas();

        System.out.println("\n===MASCOTAS ESPECIE PERRO===");
        clinica.buscarPorEspecie("Perro");

        System.out.println("\n===MASCOTAS RANGO EDAD 2 y 8 años");
        clinica.buscarPorEdad(2,8);








    }
}
