package one.innovation.digital.wesleyfuchter.stream.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Vitor Manoel", 21));
        estudantes.add(new Estudante("Maria Eduarda", 18));
        estudantes.add(new Estudante("Eduardo Henrique", 5));
        estudantes.add(new Estudante("Ana Paula", 51));
        estudantes.add(new Estudante("Suzana Beatriz", 25));


        System.out.println("Aluno - Idade " + estudantes.stream().map(elemento -> elemento.getNome().concat(" - ")
                .concat(String.valueOf(elemento.getIdade()))).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Quantidade de estudantes da coleção: " + estudantes.stream().count());
        System.out.println();

        System.out.println("Estudantes com idade maior ou igual a 18 anos: " + estudantes.stream().filter(elemento ->
                elemento.getIdade() >= 18)
                .map(elemento -> elemento.getNome().concat(" - ").concat(String.valueOf(elemento.getIdade())))
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println("Exibindo todos os estudantes: " + estudantes.stream().map(elemento -> elemento.getNome())
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println("Exibindo todos os estudantes com forEach: ");
        for (Estudante exibirEstudante : estudantes) {
            System.out.println(exibirEstudante.getNome().concat(" - ").concat(String.valueOf(
                    exibirEstudante.getIdade())));
        }
        System.out.println();

        System.out.println("Estudantes que possuem a letra B no nome: " + estudantes.stream().filter(elemento ->
                elemento.getNome().toLowerCase().contains("b")).map(elemento -> elemento.getNome().concat(" - ").concat
                (String.valueOf(elemento.getIdade())))
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println("Existe algum estudante com a letra D? " + estudantes.stream().anyMatch(elemento ->
                elemento.toString().toLowerCase().contains("d")));
        System.out.println();

        System.out.println("O estudante mais velho é: " + estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade))
                .map(elemento -> elemento.getNome().concat(" - ").concat(String.valueOf(elemento.getIdade()))));
        System.out.println();

        System.out.println("O estudante mais novo é: " + estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade))
                .map(elemento -> elemento.getNome().concat(" - ").concat(String.valueOf(elemento.getIdade()))));
        System.out.println();

    }
}
