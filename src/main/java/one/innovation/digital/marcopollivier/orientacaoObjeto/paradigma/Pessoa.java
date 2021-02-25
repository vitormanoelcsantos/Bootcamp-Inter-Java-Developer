package one.innovation.digital.marcopollivier.orientacaoObjeto.paradigma;

public class Pessoa {

    private String nome = "Vitor";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
