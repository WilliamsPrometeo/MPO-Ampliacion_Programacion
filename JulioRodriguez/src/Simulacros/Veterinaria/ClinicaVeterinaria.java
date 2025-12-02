package Simulacros.Veterinaria;

import java.util.ArrayList;

public class ClinicaVeterinaria {
    private ArrayList<Mascota> mascotas;

    public ClinicaVeterinaria() {
        mascotas = new ArrayList<>();
    }

    public void añadirMascotas(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void listarMascotas() {
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }

    public void buscarPorEspecie(String especie) {
        for (Mascota mascota : mascotas) {
            if (mascota.getEspecie().equals(especie)) {
                System.out.println(mascota);
            }
        }
    }

    public void buscarPorEdad(int min, int max) {
        for (Mascota mascota : mascotas) {
            if (mascota.getEdad() >= min && mascota.getEdad() <= max) {
                System.out.println(mascota);
            }
        }
    }


}
