package one.innovation.digital.andrelugomes.tipos.naoprimitivos;

public class NaoPrimitivos {
    public static void main(String[] args) {

        String texto = "Meu texto para apresentação"; //Sequência de caracteres. Uma cadeia de char

        Void v; //Tipo válido

        Object o = new Object();
        Number numero = Integer.valueOf(100);

        // Vantagens de usar os não primitivos, é a possibilidade de poder utilizar N métodos.
        numero.toString();

    }
}
