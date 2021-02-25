package one.innovation.digital.gabrielsantos.DIP.problema;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private MySqlConnection mySqlConnection;

    public ProdutoRepository(MySqlConnection mySqlConnection){
        this.mySqlConnection = mySqlConnection;
    }

    public List<Produto> buscarProduto(){
        return new ArrayList<>();
    }

    public void salvarProduto(){

    }
}
