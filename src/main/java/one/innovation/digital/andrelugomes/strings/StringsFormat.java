package one.innovation.digital.andrelugomes.strings;

public class StringsFormat {
    public static void main(String[] args) {

        var nome = "Vitor";
        var sobreNome = "Manoel";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);

//      Concatena as String substituindo o % pelas variáveis após a vírgula.
        System.out.println(String.format("O cliente %s possui sobre nome %s ", nome, sobreNome));


//      O ponto após o % significa que ele exibirá o valor duas casa após a vírgula
        System.out.println(String.format("Numero %.2f ", 1.2375d));
    }
}
