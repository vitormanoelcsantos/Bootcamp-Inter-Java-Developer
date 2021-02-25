package one.innovation.digital.marcopollivier.orientacaoObjeto.construtores;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Vitor");
        System.out.println("O meu nome é: "+pessoa.getNome());
    }
}
