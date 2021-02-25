package one.innovation.digital.alexduarteferreira.letraB;

public class TesteExececaoLetraB {
    public static void main(String[] args)throws SemLetraBException {
        try {
            letraB();
        }catch (SemLetraBException e){
            System.out.println("Ocorreu um erro ao executar o método letraB() " +e);
        }
    }

    public static void letraB() throws SemLetraBException{
        String frase = "Sou um teste!";
        if(!frase.contains("b") || !frase.contains("B")){
            throw new SemLetraBException();

        }
    }
}
