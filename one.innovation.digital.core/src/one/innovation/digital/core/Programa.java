package one.innovation.digital.core;

import one.innovation.digital.utils.Calculadora;

public class Programa {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("A soma é: "+calculadora.soma(3, 3));
    }
}
