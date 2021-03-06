package one.innovation.digital.joaopaulo.iteracoes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {
        String[] nomes = {"Vitor", "Maria", "Ana Paula", "Suzana", "Ralf"};
        Integer[] numeros = {1, 2, 3, 4, 5};

        imprimirNomesFiltrados(nomes);
        System.out.println();
        imprimirTodosOsNomes(nomes);
        System.out.println();
        imprimirTodosOsNumeros(numeros);
    }

    public static void imprimirNomesFiltrados(String... nomes){ // ... é igual a []
        String nomesParaImprimir="";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Vitor")){
                nomesParaImprimir += nomes[i];
            }
        }
        System.out.println("Imprimindo pelo For: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(elemento -> elemento.equals("Vitor"))
                .collect(Collectors.joining());
        System.out.println("Imprimindo pela Stream: "+nomesParaImprimirDaStream);
        // O joining pega um Array de String e transforma cada elemento em um espaço
    }

    public static void imprimirTodosOsNomes(String... nomes){
        for (String nomesForeach: nomes
             ) {
            System.out.println("Imprimido pelo Foreach: "+nomesForeach);
        }

        System.out.println();
        Stream.of(nomes).forEach(elemento -> System.out.println("Imprmindo pela Stream: "+elemento));
    }

    public static void imprimirTodosOsNumeros(Integer... numeros){
        for (Integer numerosForeach: numeros
             ) {
            System.out.println(numerosForeach+" vezes 2 é igual a = "+numerosForeach * 2);
        }

        System.out.println();
        Stream.of(numeros).forEach(elemento -> System.out.println("Imprimindo pela Stream" +
                " e multiplicando "+elemento+ " por 2 que é igual a = "+elemento*2));
    }
}
