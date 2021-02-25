package one.innovation.digital.andrelugomes.strings;

public class Strings {
    public static void main(String[] args) {

        var nome = "Vitor";
        var sobreNome = "Manoel";
        final var nomeCompleto = nome + sobreNome; // Concatenado strings

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        var string = new String("Vitor Manoel");

        System.out.println("Char na posição : " + string.charAt(5));
//      O charAt retorna o char na posição escolhida da String.
        System.out.println("Quantidade=" + string.length());
//      O length retorna o tamanho da cadeia da String.
        System.out.println("Sem Trim [" + string + "]");
//      O método Trim é responsável por remover os espaços em branco da String. O exemplo acima está sem o trim.
        System.out.println("Com Trim [" + string.trim() + "]");
//      O método Trim é responsável por remover os espaços em branco da String. O exemplo acima está com o trim.
        System.out.println("Lower " + string.toLowerCase());
//      O método toLowerCase é reponsável por colocar a string em caixa baixa.
        System.out.println("Upper " + string.toUpperCase());
//      O método toUpperCase é reponsável por colocar a string em caixa alta.
        System.out.println("Contém M? " + string.contains("M"));
//      O método contains é uma condicional. Ela retorna true se contém o que é passado como parâmetro no método
//      dentro da String que você deseja procurar.
        System.out.println("Contém X? " + string.contains("X"));
//      Se não, retorna false.
        System.out.println("Replace " + string.replace("Manoel", "Santos"));
        System.out.println("Replace " + string.replace("o", "6"));
//      O método replace, substitui a String por outra String.
        System.out.println("Equals? " + string.equals("Vitor Manoel"));
//      O método equals é utilizado para fazer comparação. Retornado true se for igual, false se for diferente.
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase("vitor manoel"));
//      O equalsIgnoreCase ele faz a comparação ignorando a se é maiúsculo ou minúsuclo.
        System.out.println("Substring(0, 5)= " + string.substring(0, 5));
//      O substring pega a String a partir de N até N.

    }
}
