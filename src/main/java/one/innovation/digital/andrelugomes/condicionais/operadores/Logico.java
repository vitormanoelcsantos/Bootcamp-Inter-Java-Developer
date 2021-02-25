package one.innovation.digital.andrelugomes.condicionais.operadores;

public class Logico {
    public static void main(String[] args){
        final var numero = 2;
        final var letra = "A";

        //Sort Circuit
//      Ele verifica as duas posiçõe, porém se a primeira for falsa, ele já descarta sem verificar a segunda
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outracondição");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }

        //Non Sort Circuit
//      Ele verifica o primeiro e também verifica o segundo
    if (verifica(15) | verifica("A")) {
        System.out.println("OK");
    } else {
        System.out.println("Não OK");
    }

    }

    private static boolean verifica(String letra) {
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("verificando numero...");
        return numero > 10;
    }
}
