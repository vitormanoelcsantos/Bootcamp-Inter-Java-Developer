package one.innovation.digital.wesleyfuchter.optionals.desafio;

import java.util.Optional;

public class Programa {
    public static void main(String[] args) {
        Optional<Integer> idade;
        Optional<Integer> novaIdade;
        idade = Optional.empty();

        idade.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio."));

//        idade = Optional.ofNullable(null);
//
//        System.out.println(idade.orElseThrow(IllegalStateException::new));

        idade = Optional.of(15);

        idade.ifPresent(System.out::println);

        idade.map((valor) -> valor.toString().concat(", anos.")).ifPresent(System.out::println);

        if(idade.isPresent()){
            novaIdade = idade;
            System.out.println(novaIdade+" Atribuída a uma nova variável.");
        }

        Optional<Integer> filtroIdade = idade.filter(i -> (i > 18));
        if (filtroIdade.isPresent()){
            System.out.println(filtroIdade);
        }else {
            System.out.println("Não está presente um maior de idade.");
        }
    }
}
