package one.innovation.digital.andrelugomes.tipos.tipagem;

public class TipoInferido {
    public static void main(String[] args) {

        // Através da palavra var, é possível definir tipos sem precisar dizer explicitamente o tipo da variável
        // fica a cargo do próprio computador?, entender qual o tipo da variável através do que atribuímos a ela.
        // Disponível a partir da versão 10 do java


        var numero = Integer.valueOf("123456");

        var texto = "O Numero é : " ;

        System.out.println(texto + numero);

    }
}
