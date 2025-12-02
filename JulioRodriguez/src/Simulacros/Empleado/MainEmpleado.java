package Simulacros.Empleado;

import Simulacros.MyScanner;

public class MainEmpleado {
    public static void main(String[] args) {
        MyScanner MySc = new MyScanner();

        System.out.println("=== GESTOR DE EMPLEADOS ===");

        String nombre = MySc.pedirTexto("Introduce el nombre del empleado: ");
        String cargo = MySc.pedirTexto("Introduce el cargo: ");
        double sueldo = MySc.pedirDecimal("Introduce el sueldo base: ");
        double bono = MySc.pedirDecimal("Introduce el porcentaje de bonificación: ");
        double irpf = MySc.pedirDecimal("Introduce el porcentaje de IRPF: ");

        Empleado e = new Empleado(nombre, cargo, sueldo, bono, irpf);
        e.mostrarResum();

        MySc.cerrar();
    }
}
