package one.innovation.digital.joaopaulo.imutabilidade;

import java.util.function.UnaryOperator;

public class Programa {
    public static void main(String[] args) {
        Integer numero = 10;
        UnaryOperator<Integer> calcular = valor -> valor * 2;
        System.out.println("Número multiplicado por 2: "+calcular.apply(numero));
        System.out.println("Número não alterado: "+numero);
    }
}
