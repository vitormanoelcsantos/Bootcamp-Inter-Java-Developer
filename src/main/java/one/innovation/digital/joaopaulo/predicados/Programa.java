package one.innovation.digital.joaopaulo.predicados;

import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {
//        Predicate<String> estaVazio = string -> string.isEmpty();
        Predicate<String> estaVazio = String::isEmpty; // referência de método
        System.out.println("Está vazio?: "+estaVazio.test("Vitor"));
        System.out.println("Está vazio?: "+estaVazio.test(""));

    }
}
