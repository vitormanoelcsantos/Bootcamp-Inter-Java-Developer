package one.innovation.digital.joaopaulo.functions;

import java.util.function.Function;

public class Programa {
    public static void main(String[] args) {
        Function<String, String> nomeAoContrario = nome -> new StringBuilder(nome).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(nomeAoContrario.apply("Vitor"));
        System.out.println(converterStringParaInteiroECalculaODobro.apply("5"));
    }
}
