package one.innovation.digital.joaopaulo.consumidores;

import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaSegundaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
        imprimirUmaSegundaFrase.accept("Hello World :)");
    }
}
