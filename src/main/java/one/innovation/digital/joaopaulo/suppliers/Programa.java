package one.innovation.digital.joaopaulo.suppliers;

import java.util.function.Supplier;

public class Programa {
    public static void main(String[] args) {
        Supplier<Pessoa> pessoaSupplier = () -> new Pessoa();
//        Supplier<Pessoa> pessoaSupplier = Pessoa::new; // método de referência
        System.out.println(pessoaSupplier.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa() {
        this.nome = "Vitor";
        this.idade = 21;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome = '" + nome + '\'' +
                ", Idade = " + idade +
                '}';
    }
}
