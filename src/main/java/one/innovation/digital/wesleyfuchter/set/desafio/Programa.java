package one.innovation.digital.wesleyfuchter.set.desafio;


import java.util.*;

public class Programa {
    public static void main(String[] args) {
        /** HashSet */
        hashSet();
        traco();

        /** LinkedHashSet */
        linkedHashSet();
        traco();

        /** TreeSet */
        treeSet();
        traco();
    }

    static void traco() {
        System.out.println();
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println();
    }

    static void hashSet() {
        Set<Integer> numerosHashSet = new HashSet<>();
        numerosHashSet.add(3);
        numerosHashSet.add(88);
        numerosHashSet.add(20);
        numerosHashSet.add(44);
        numerosHashSet.add(3);

        for (Integer numerosDaHashSet : numerosHashSet
        ) {
            System.out.println("HashSet: " + numerosDaHashSet);
        }
        System.out.println();


        System.out.println("Removendo o primeiro item do HashSet");
        numerosHashSet.remove(3);
        System.out.println();

        System.out.println("Adicionando um novo número 23 ao HashSet.");
        numerosHashSet.add(23);
        System.out.println();

        System.out.println("Tamanho do HashSet: " + numerosHashSet.size());
        System.out.println();

        System.out.println("O HashSet está vazio? " + numerosHashSet.isEmpty());
        System.out.println();

        System.out.println("Lista de número do HashSet atualizada: ");
        for (Integer numerosDoHashSet : numerosHashSet
        ) {
            System.out.println("----> " + numerosDoHashSet);
        }
    }

    static void linkedHashSet() {
        Set<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.add(3);
        numerosLinkedHashSet.add(88);
        numerosLinkedHashSet.add(20);
        numerosLinkedHashSet.add(44);
        numerosLinkedHashSet.add(3);

        for (Integer numerosDoLinkedHashSet : numerosLinkedHashSet
        ) {
            System.out.println("LinkedHashSet: " + numerosDoLinkedHashSet);
        }
        System.out.println();


        System.out.println("Removendo o primeiro item do LinkedHashSet");
        numerosLinkedHashSet.remove(3);
        System.out.println();

        System.out.println("Adicionando um novo número 23 ao LinkedHashSet.");
        numerosLinkedHashSet.add(23);
        System.out.println();

        System.out.println("Tamanho do LinkedHashSet: " + numerosLinkedHashSet.size());
        System.out.println();

        System.out.println("O LinkedHashSet está vazio? " + numerosLinkedHashSet.isEmpty());
        System.out.println();

        System.out.println("Lista de números do LinkedHashSet atualizada: ");
        for (Integer numerosDoLinkedHashSet : numerosLinkedHashSet
        ) {
            System.out.println("----> " + numerosDoLinkedHashSet);
        }
    }


    static void treeSet() {
        TreeSet<Integer> numerosTreeSet = new TreeSet<>();
        numerosTreeSet.add(3);
        numerosTreeSet.add(88);
        numerosTreeSet.add(20);
        numerosTreeSet.add(44);
        numerosTreeSet.add(3);

        for (Integer numerosDaTreeSet : numerosTreeSet
        ) {
            System.out.println("TreeSet: " + numerosDaTreeSet);
        }
        System.out.println();

        System.out.println("Removendo o primeiro item do TreeSet");
        numerosTreeSet.pollFirst();
        System.out.println();

        System.out.println("Adicionando um novo número 23 ao TreeSet.");
        numerosTreeSet.add(23);
        System.out.println();

        System.out.println("Tamanho do TreeSet: " + numerosTreeSet.size());
        System.out.println();

        System.out.println("O TreeSet está vazio? " + numerosTreeSet.isEmpty());
        System.out.println();

        System.out.println("Lista atualizada de números do TreeSet: ");
        for (Integer numerosDaTreeSet : numerosTreeSet
        ) {
            System.out.println("----> " + numerosDaTreeSet);
        }
    }
}
