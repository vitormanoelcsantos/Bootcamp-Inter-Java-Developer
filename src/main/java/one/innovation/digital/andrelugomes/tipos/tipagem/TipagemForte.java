package one.innovation.digital.andrelugomes.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args) {

        // Tipagem forte significa que assim que atribuido um tipo a uma variável, não será possível mudar o tipo
        // de valor que ela recebe.
        // Como no exemplo abaixo, atribuimos um texto a uma string e logo em seguida tentamos por um número nela
        // assim sendo, ocorrendo um erro.

        String texto = "meu texto";

        //texto = 1000; //NOK


        // O que já não acontece aqui. O valor é mudado logo abaixo.
        Integer numero = Integer.valueOf("1024");

        numero = 512; //OK

        System.out.println(numero);
    }
}
