package one.innovation.digital.andrelugomes.classes.pessoa;


public class ProgramaDoCliente{
    public static void main(String[] args) {
        final var cliente = new Pessoa(18);

        cliente.getIdade();
        cliente.getPeso();


        System.out.println(cliente.relatorio()); //OK
    }
}
