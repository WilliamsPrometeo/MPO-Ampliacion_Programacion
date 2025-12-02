    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) {
        int intentos = 0; // Contador de intentos
        boolean edadValida=false;
        int edad = 0;
        while (intentos< 3 && !edadValida){ // Bucle para medir los intentos
            edad = sc.pedirNumero("introduce tu edad:");
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
        sc.cerrar(); // para cerrar el scanner
    }

        