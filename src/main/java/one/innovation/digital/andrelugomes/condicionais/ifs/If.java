package one.innovation.digital.andrelugomes.condicionais.ifs;

public class If {
    public static void main(String[] args) {
        final var condicao = false;

        if (condicao) {
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        if (condicao) // Se o if for executar uma verificação, e possuir apenas uma resposta para ela, não precisa do
            // do escopo
            System.out.println("Uma única linha...");
            System.out.println("");


        var ternario = condicao ? "é verdadeira" : "é falsa";

        System.out.println(ternario);
    }
}
