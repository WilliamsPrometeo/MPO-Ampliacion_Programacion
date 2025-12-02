package Simulacros.Empleado;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldoBase;
    private double bonificacion;
    private double irpf;

    public Empleado(String nombre, String cargo, double sueldoBase, double bonificacion, double irpf) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.irpf = irpf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldoBase;
    }

    public void setSueldo(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }


    public double calcularSueldoFinal() {
        double totalBonificacion = sueldoBase * (bonificacion / 100);
        double totalIRPF = sueldoBase * (irpf / 100);
        return sueldoBase + totalBonificacion - totalIRPF;
    }

    public void mostrarResum () {
        System.out.println();
        System.out.println("===== RESUMEN DE EMPLEADO ====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo Base: " + sueldoBase);
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("IRPF: " + irpf + " %");
        System.out.printf("Sueldo final: %.2f €%n", calcularSueldoFinal());
        System.out.println("================================");
    }

}
