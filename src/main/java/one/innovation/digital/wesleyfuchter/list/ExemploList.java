package one.innovation.digital.wesleyfuchter.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa"); // Substitui o elemento de acordo com o index escolhido

        System.out.println(nomes);

        Collections.sort(nomes); // Organiza os nomes por ordem alfabética

        nomes.set(2, "Wesley"); // Aqui a Larissa não foi substituida porque a lista foi ordenada
        // então a Larissa trocou de posição.

        System.out.println(nomes);

        nomes.remove(4); // É possível remover um elemento de acordo com o index escolhido

        System.out.println(nomes);

        nomes.remove("Wesley"); // Também é possível remover um elemento de acordo com o valor do Objeto

        System.out.println(nomes);

        System.out.println(nomes.get(3)); // O get retorna o elemento.

        System.out.println(nomes.indexOf("Wesley")); // O indexOf retorna a posição do elemento.
        // Caso retorne -1 é porque o elemento não existe na lista.

        System.out.println(nomes.size()); // O size retorna elementos a lista possui.

        nomes.remove("Larissa");

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Anderson")); // Retorna um booleano de acordo com o elemento da lista
        // se ele estiver na lista, retorna true e se não, false

        System.out.println(nomes.isEmpty()); // Retorna um booleano, se a lista estiver vazia retorna true
        // se não, retorna false

        System.out.println(nomes);

        for (String nomeDoItem : nomes) { // Listando os elementos da lista através do foreach

            System.out.println("Foreach: " + nomeDoItem);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) { // Listando os elementos da lista através do Iterator

            System.out.println("Iterator: " + iterator.next());

        }

        nomes.clear(); // Limpa todos os elementos da lista.

        System.out.println("A lista está vazia? "+nomes.isEmpty());
    }
}
