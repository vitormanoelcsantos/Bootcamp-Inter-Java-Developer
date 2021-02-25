package one.innovation.digital.andrelugomes.tipos.naoprimitivos;

public class Unboxing {
    public static void main(String[] args) {
        //É possível criar uma variável primitiva e atribuir a ela um Objeto wrapper

        int i = new Integer(3);

        int inteiro = Integer.valueOf(1024);

        //boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

    }
}
