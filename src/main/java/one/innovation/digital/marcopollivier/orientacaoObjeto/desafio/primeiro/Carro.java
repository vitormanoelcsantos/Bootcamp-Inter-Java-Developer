package one.innovation.digital.marcopollivier.orientacaoObjeto.desafio.primeiro;

public class Carro {
    private String marca = "Ford";
    private Integer quantidade = 3;

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void all(){
        System.out.println("A marca do carro é: " +marca);
        System.out.println("A quantidade de pessoas no carro é: " +quantidade);
    }

    public Integer mostrarQuantidade(){
        return quantidade;
    }
}
