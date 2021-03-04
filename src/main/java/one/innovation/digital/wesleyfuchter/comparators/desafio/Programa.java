package one.innovation.digital.wesleyfuchter.comparators.desafio;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
//        – Alagoas (82)
//        – Bahia (71, 73, 74, 75 e 77)
//        – Ceará (85 e 88)
//        – Maranhão (98 e 99)
//        – Paraíba (83)
//        – Pernambuco (81 e 87)
//        – Piauí (86 e 89)
//        – Rio Grande do Norte (84)
//        – Sergipe (79)

        listaEstado();
        traco();
        treeSetEstado();
        traco();
        treeMapEstado();
        traco();
    }
      static void traco(){
        System.out.println();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println();
    }
    static void listaEstado(){
        List<Estado> estados = new ArrayList<>();
        estados.add(new Estado("Alagoas", 82));
        estados.add(new Estado("Bahia", 71));
        estados.add(new Estado("Ceará", 85));
        estados.add(new Estado("Maranhão", 98));
        estados.add(new Estado("Paraíba", 83));
        estados.add(new Estado("Pernambuco", 81));
        estados.add(new Estado("Piauí", 81));
        estados.add(new Estado("Rio Grande do Norte", 84));
        estados.add(new Estado("Sergipe", 79));


        Collections.sort(estados, new EstadoReversoDDD());
        System.out.println("Ordenando na ordem decrescente utilizando a java.util.Comparator no meu Objeto complexo:\n "+estados);
        System.out.println();

        Collections.sort(estados);
        System.out.println("Ordenando na ordem crescente utilizando a java.util.Comparable no meu Objeto complexo:\n "+estados);
        System.out.println();

        estados.sort((first, second) -> first.getDdd() - second.getDdd());
        System.out.println("Ordenando na ordem crescente utilizando expressões lambda:\n "+estados);
        System.out.println();

        Collections.sort(estados, new EstadoOrdenadoNome());
        System.out.println("Ordenando na ordem alfabética dos nomes utilizando java.util.Comparator no meu Objeto complexo:\n "+estados);
        System.out.println();
    }

    static void treeSetEstado(){
        Set<Estado> estados = new TreeSet<>(new EstadoOrdenadoNome());
        estados.add(new Estado("Alagoas", 82));
        estados.add(new Estado("Bahia", 71));
        estados.add(new Estado("Ceará", 85));
        estados.add(new Estado("Maranhão", 98));
        estados.add(new Estado("Paraíba", 83));
        estados.add(new Estado("Pernambuco", 81));
        estados.add(new Estado("Piauí", 81));
        estados.add(new Estado("Rio Grande do Norte", 84));
        estados.add(new Estado("Sergipe", 79));

        System.out.println("Ordenando na ordem alfabética utilizando a java.util.Comparator no meu Objeto complexo:\n "+estados);
        System.out.println();
    }

    static void treeMapEstado(){
        Map<Integer, Estado> estados = new TreeMap<>();

        estados.put(1, new Estado("Alagoas", 82));
        estados.put(2, new  Estado("Bahia", 71));
        estados.put(3, new Estado("Ceará", 85));
        estados.put(4, new Estado("Maranhão", 98));
        estados.put(5, new Estado("Paraíba", 83));
        estados.put(6, new Estado("Pernambuco", 81));
        estados.put(7, new Estado("Piauí", 81));
        estados.put(8, new Estado("Rio Grande do Norte", 84));
        estados.put(9, new Estado("Sergipe", 79));

        System.out.println("Ordenado de acordo com as chaves:\n "+estados);
        System.out.println();

        for(Map.Entry<Integer, Estado> exibidoPorValor : estados.entrySet()){
            System.out.println("Key: "+exibidoPorValor.getKey()+", Value: "+exibidoPorValor.getValue());
        }
    }
}
