package one.innovation.digital.andrelugomes.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {

        final Default d = new Default();

        System.out.println(d.getI());

        System.out.println(d.isActive());

    }
}

class Default {

    //Nenhum valor está sendo atribuído as variáveis, porém elas estão retornado valores, por quê?
    // Porque tipos primitivos possuem valores default.

    int i;
    boolean active;

    public int getI() {
        return i;
    }

    public boolean isActive() {
        return active;
    }
}
