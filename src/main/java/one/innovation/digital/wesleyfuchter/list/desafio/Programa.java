package one.innovation.digital.wesleyfuchter.list.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nomesDaLista: nomes){
            System.out.println("-> " +nomesDaLista);

        }
        System.out.println();

        nomes.set(2, "Roberto");
        nomes.get(0);
        nomes.remove(3);
        nomes.remove("João");

        for (String nomesDaLista: nomes){
            System.out.println("-> " +nomesDaLista);

        }
        System.out.println();

        System.out.println("O tamanho da lista: "+nomes.size());
        System.out.println();

        System.out.println("Contém o nome Juliano na lista? "+nomes.contains("Juliano"));
        System.out.println();

        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        for (String exibirNomesDaListaNova: novosNomes){
            System.out.println("----> " +exibirNomesDaListaNova);

        }
        System.out.println();

        for (String nomesDaNovaLista: novosNomes){
            nomes.add(nomesDaNovaLista);
        }

        for (String nomesDaLista: nomes){
            System.out.println("------> " +nomesDaLista);

        }
        System.out.println();

        Collections.sort(nomes);

        System.out.println("A lista está vazia? " +nomes.isEmpty());
    }
}
