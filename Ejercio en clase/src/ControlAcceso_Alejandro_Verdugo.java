import java.util.Scanner;
public class ControlAcceso_Alejandro_Verdugo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // objeto sc para leer lo que pone el usuario
        int intentos = 0; // Contador de intentos
        boolean edadValida=false;
        int edad = 0;
        while (intentos< 3 && !edadValida){ // Bucle para medir los intentos
            System.out.print("Introduce tu edad:");
            edad = sc.nextInt();
            if (edad<0 || edad >120){
                System.out.println("Error : edad inválida");
            intentos++;
        } else {
                edadValida=true;
            }
    }
        if (!edadValida){
            System.out.println("Se han agotadolos intentos");
        } else  { // para medir su rango de edad
            if ( edad < 18){
                System.out.println("Acceso denegado: Menor de edad");
            }else if ( edad <= 65){
                System.out.println("Acceso permitido");
            }else {
                System.out.println("Acceso con beneficios para jubilados");
            }
        }
        sc.close(); // para cerrar el scanner
    }
}
        