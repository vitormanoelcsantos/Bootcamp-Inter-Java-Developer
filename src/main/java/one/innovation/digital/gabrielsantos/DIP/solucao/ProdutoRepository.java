package one.innovation.digital.gabrielsantos.DIP.solucao;

import one.innovation.digital.gabrielsantos.DIP.problema.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private DbConnection dbConnection;

    public ProdutoRepository(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public List<Produto> buscarProduto(){
        return new ArrayList<>();
    }

    public void salvarProduto(){

    }
}
