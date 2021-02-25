package one.innovation.digital.andrelugomes.interfaces;

public class Programa {
    public static void main(String[] args) {

//      Como dito anteriormente, a classe se torna aquela interface que ela implementou ou seja,
//      um Objeto gol, também é do tipo carro.

//      final Gol gol = new Gol();
        final Carro gol = new Gol();
        System.out.println("Marca do Gol : "+gol.marca());
        gol.ligar();

        gol.autom(); // Método herdado de um interface que herda outra interface

        final Veiculo trator = new Trator();
        System.out.println("Registro do Trator :"+trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta : "+fiesta.marca());
        System.out.println("Registro do Fiesta : "+fiesta.registro());

        fiesta.ligar();

        System.out.println(fiesta.autot()); // Método herdado de um interface que herda outra interface

        //Carro.super.ligar(); //só pode ser acessado por quem implementa
    }
}
