package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.exemplo03.equals;

import java.util.Objects;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private Integer preco;

    public Veiculo(String modelo, String marca, Integer preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Veiculo veiculo;

        if (obj instanceof Veiculo) {
            veiculo = (Veiculo) obj;
        } else {
            return false;
        }

        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, preco);
    }

}

//        if (veiculo.marca == this.marca && veiculo.modelo == this.modelo && veiculo.preco == this.preco){
//            return true;
//        }
//        return false;





