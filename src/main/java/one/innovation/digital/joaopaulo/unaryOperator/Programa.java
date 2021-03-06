package one.innovation.digital.joaopaulo.unaryOperator;

import java.util.function.UnaryOperator;

public class Programa {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularVezesTres = valor -> valor * 3;
        Integer numero = 10;
        System.out.println("O resultado da multiplicação é: "+calcularVezesTres.apply(numero));

    }
//    static Integer multiplicacao(Integer valor){
//        return valor * 3;
//    }
}
