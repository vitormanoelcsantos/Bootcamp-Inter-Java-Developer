package one.innovation.digital.alexduarteferreira;

public class Finally {
    public static void main(String args[]){

        String frase = "bo dia";
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e)
        {
            System.out.println("O frase inicial está nula, para " +
                    "solucionar tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
        }
        finally
        {
            novaFrase = frase.toUpperCase(); // Mesmo que não entre no bloco catch
            // o finally será executado.
        }

        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}
