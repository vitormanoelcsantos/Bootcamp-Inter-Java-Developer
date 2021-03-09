package one.innovation.digital.joaopaulo.inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;


public class Programa {
    /**
     * Inferência de dados não funciona com variáveis globais
     */
//    private String nome = new String("Vitor");
//    private var segundoNome = new String("Vitor");
    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
//        printarNomeCompleto("Vitor", "Manoel");
//        printarSoma(1, 2, 3, 4);

    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
            System.out.println(bufferedReader.lines()
                    .collect(Collectors.joining())
                    .replaceAll(">", ">\n"));
        }
    }

    public static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(Integer... numeros) {
        Integer soma = 0;
        for (var numero = 0; numero < numeros.length; numero++) {
            soma += numeros[numero];
        }
//        for (var numero : numeros
//        ) {
//            soma += numero;
//        }

        System.out.println("A soma é ::: " + soma);
    }
}


