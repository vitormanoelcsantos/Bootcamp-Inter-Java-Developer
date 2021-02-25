package one.innovation.digital.andrelugomes.strings;

public class StringsBuilder {
    public static void main(String[] args) {

        var nome = "Vitor";

        final var builder = new StringBuilder(nome);
//      O append é forma como o builder concatena um novo valor.
        System.out.println(builder.append(" Manoel"));

//      final var reverse = builder.reverse();

//      O reverse é responsável por reverter os caracters da String.
        System.out.println(builder.reverse());

//      final var insert = builder.insert(0, "#").insert(builder.length(), "#");

//      O insert insere um valor na posição escolhida.
        System.out.println(builder.insert(0, "#").insert(builder.length(), "#"));
    }
}

