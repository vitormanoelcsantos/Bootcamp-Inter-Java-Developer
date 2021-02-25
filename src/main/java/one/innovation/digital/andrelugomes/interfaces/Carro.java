package one.innovation.digital.andrelugomes.interfaces;

public interface Carro extends Automovel {

//  Método sem definição, então fica implicito que seja public. E precisa ser sobrescrito assim que implementado
//  numa classe.
    String marca();


//  Um método sem definição é implicito que ele seja public abstract.
    Double valor();



//  Método default, é automaticamente herdado assim que uma classe implementa a interface.
//  Não sendo necessário sobrescrever esse método. E assim que uma classe implementa uma interface,
//  ela se torna aquela interface, por isso não precisa sobrescrever métodos default.

    default void ligar() {

        System.out.println("Ligando o carro! CARRO");
    }

    default String codigoRenavan() {
        return "6533jijiio";
    }

    default void algo(){
        System.out.println("Haaaahaaaaaaai");
    }
}