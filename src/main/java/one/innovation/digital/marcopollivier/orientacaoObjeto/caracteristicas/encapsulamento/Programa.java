package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.encapsulamento;

public class Programa {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Vitor", 01, 8, 1999);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Marco Paulo");

        System.out.println(eu.getNome());
    }
}
