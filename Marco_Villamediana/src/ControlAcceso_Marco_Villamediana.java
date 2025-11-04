//EJERCICIO DE MARCO VILLAMEDIANA PONCE DAW
//FECHA: 31/10/2025
public class ControlAcceso_Marco_Villamediana {

    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) { //Aquí pondremos únicamente el código que vamos a ejecutar
        int edad = pedirEdad();

        System.out.println(comrpobarEdad(edad));

        sc.cerrar();
    }
    public static int pedirEdad (){ //Creamos el método para pedir la  Edad
        boolean valido;
        int edad;
        int intentos =0;

        do{

            edad = sc.pedirNumero("Ingrese edad: ");

            if (edad < 0 || edad > 120){

                intentos ++; //Creamos un contador para poner un límite de intentos
                System.out.println("Edad no válida. Intento "+intentos+ " de 3.");
                valido=false;
            }
            else{
                valido=true;
            }
        }while(!valido && intentos < 3); //Hacemos un while para generar un bucle que se ejecute hasta fallar 3 veces


        return edad;
    }

    public static String comrpobarEdad (int edad){ //Creamos un método para comprobar la Edad e imprimir el mensaje correspondiente para cada grupo de edad

        if (edad < 18){
            System.out.println("Acceso denegado: menor de edad");
        } else if (edad <= 65){
            System.out.println("Acceso permitido");
        } else if (edad > 65){
            System.out.println("Acceso con beneficios para jubilados");
        }

        return String.valueOf(edad);

    }


}
//¿Por qué es útil limitar el número de intentos? Porque así pones un límite para que el código no esté en un bucle infinito de ejecución (por ejemplo, si se pilla alguna tecla)
//¿Qué ventajas tiene validar los datos antes de procesarlos? Así evitas errores y te aseguras de que el código funcione correctamente
//¿Qué sucedería si no se controlara el rango de edad? Que, entonces, el control de acceso funcionaria con cualquier número, y no diferenciaría entre grupos de edades. Sin embargo, con el limitador de edad de 0 a 120 años te aseguras de que se ponga una edad real, además de después con el método comprobarEdad puedes diferenciar entre grupos de edades (menores, adultos y jubilados)


