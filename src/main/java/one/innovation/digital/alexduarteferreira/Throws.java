package one.innovation.digital.alexduarteferreira;

public class Throws {
    public static void main(String args[])
    {
        try
        {
            aumentarLetras();
        }
        catch(NullPointerException e)
        {
            System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() "+e);
        }
    }
    private static void aumentarLetras() throws NullPointerException //lançando exceção
    {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}
