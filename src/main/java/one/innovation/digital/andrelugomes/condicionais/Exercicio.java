package one.innovation.digital.andrelugomes.condicionais;

import java.util.stream.IntStream;

public class Exercicio {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,10).forEach(n ->{
            System.out.println("Os números na Stream de inteiros são: " +n);
        });

        IntStream.range(0,11).forEach(n -> {
            System.out.println("Número: " +n);
        });
    }
}
