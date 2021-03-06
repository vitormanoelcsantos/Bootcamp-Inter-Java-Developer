package one.innovation.digital.joaopaulo.composicaoDeFuncoes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Integer[] valores = {1, 2, 3, 4, 5, 6};
        System.out.println("Resultado da multiplicação dos números pares por 2: "+Arrays.stream(valores)
                .filter(elemento -> elemento % 2 == 0)
                .map(elemento -> elemento * 2)
                .collect(Collectors.toList()));

    }
}
//    public static void main(String[] args) {
//        exibir(10, 10);
//    }
//
//    static void exibir(Integer c, Integer d){
//        System.out.println("A soma é: "+soma(c, d));
//    }
//
//    static Integer soma(Integer a, Integer b){
//        return a + b;
//    }
//}
