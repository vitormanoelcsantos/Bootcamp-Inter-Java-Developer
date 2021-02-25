package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.exemplo03.equals;

public class Carro extends Veiculo{
    private Integer quantidadePortas;

    public Carro(String modelo, String marca, Integer preco){
        super(modelo, marca, preco);
    }

    public Carro(String modelo, String marca, Integer preco, Integer quantidadePortas){
        super(modelo, marca, preco);
        this.quantidadePortas = quantidadePortas;
    }


}
