package one.innovation.digital.andrelugomes.interfaces;

public interface Veiculo {

    String registro();

    default void ligar() {

        System.out.println("Ligando o veículo! VEICULO");
    }

    //void desligar();

    /*default void desligar() {
        System.out.println("Desligando o veículo!");
    }*/
}