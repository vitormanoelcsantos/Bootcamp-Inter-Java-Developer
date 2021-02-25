package one.innovation.digital.gabrielsantos.SRP.solucao;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OrdemDeCompra {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){produtos.add(produto);}
    public void removerProduto(Produto produto){produtos.remove(produto);}

    public BigDecimal calcularTotal(){
        return produtos.stream().map(Produto::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);

    }
}
