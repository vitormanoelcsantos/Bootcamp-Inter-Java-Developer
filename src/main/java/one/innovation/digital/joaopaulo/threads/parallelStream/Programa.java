package one.innovation.digital.joaopaulo.threads.parallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Programa {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num)); // Serial stream
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num)); // Parallel stream
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel: "+(fim-inicio));

        System.out.println();
        List<String> nomes = Arrays.asList("João", "Oliveira", "Paulo", "Santos");
        nomes.parallelStream().forEach(System.out::println);
    }

    public static long fatorial(long nun) {
        long fat = 1;

        for (long i = 2; i <= nun; i++) {
            fat *= i;
        }
        return fat;
    }
}

