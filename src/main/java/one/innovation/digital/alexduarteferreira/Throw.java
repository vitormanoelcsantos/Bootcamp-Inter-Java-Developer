package one.innovation.digital.alexduarteferreira;

public class Throw {
    public static void main(String args[]) {
        try {
            aumentarLetras();
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção ao executar o método aumentarLetras() " + e);
        }
    }
    private static void aumentarLetras() throws Exception //lançando exceção
    {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            throw new Exception(e);
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
