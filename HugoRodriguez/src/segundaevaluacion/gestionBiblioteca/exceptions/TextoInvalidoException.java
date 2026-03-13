package segundaevaluacion.gestionBiblioteca.exceptions;

public class TextoInvalidoException extends Exception {

    private static final long serialVersionUID = 1L;
    private final String texto;
    private final int longitudMinima;
    private final int longitudMaxima;

    public TextoInvalidoException(String texto, int longitudMinima, int longitudMaxima) {
        super();
        this.texto = texto;
        this.longitudMinima = longitudMinima;
        this.longitudMaxima = longitudMaxima;
    }

    @Override
    public String toString() {
        if (texto.length() < longitudMinima) {
            return "El texto introducido es demasiado corto. Texto introducido: '" + texto + "'. La longitud mínima permitida es: " + longitudMinima;
        } else if (texto.length() > longitudMaxima) {
            return "El texto introducido es demasiado largo. Texto introducido: '" + texto + "'. La longitud máxima permitida es: " + longitudMaxima;
        } else {
            return "El texto introducido es inválido. Texto introducido: '" + texto + "'. La longitud permitida es entre " + longitudMinima + " y " + longitudMaxima + " caracteres.";
        }
    }

}
