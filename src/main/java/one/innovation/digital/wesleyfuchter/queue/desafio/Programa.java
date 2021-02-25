package one.innovation.digital.wesleyfuchter.queue.desafio;

import java.util.LinkedList;
import java.util.Queue;

public class Programa {
    public static void main(String[] args) {
        Queue<String> filaSupermercado = new LinkedList<>();

        filaSupermercado.add("Juliana");
        filaSupermercado.add("Pedro");
        filaSupermercado.add("Carlos");
        filaSupermercado.add("Larissa");
        filaSupermercado.add("João");

        for (String nomeDasPessoasNaFila : filaSupermercado
        ) {
            System.out.println("--> " + nomeDasPessoasNaFila);
        }
        System.out.println();

        System.out.println("O primeiro da fila: " +filaSupermercado.peek());
        System.out.println();

        System.out.println("Removendo o primeiro da fila: " +filaSupermercado.poll());
        System.out.println();

        System.out.println("Adicionando Daniel a fila.");
        filaSupermercado.add("Daniel");
        System.out.println();

        for (String nomeDasPessoasNaFila : filaSupermercado
        ) {
            System.out.println("--> " + nomeDasPessoasNaFila);
        }
        System.out.println();

        System.out.println("O tamanho da lista é: " +filaSupermercado.size());
        System.out.println();

        System.out.println("A lista está vazia: " +filaSupermercado.isEmpty());
        System.out.println();

        System.out.println("O nome Carlos está na lista? " +filaSupermercado.contains("Carlos"));
    }
}
