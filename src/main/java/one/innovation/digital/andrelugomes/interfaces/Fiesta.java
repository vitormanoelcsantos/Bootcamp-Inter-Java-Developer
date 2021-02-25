package one.innovation.digital.andrelugomes.interfaces;

// Podendo herdar mais de uma interface
// Quando uma classe implementa mais de uma interface e essas interfaces tem os mesmos métodos
// mesmo sendo default, tem que implementar uma das, mesmo sem saber qual é.
public class Fiesta implements Carro, Veiculo {

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public Double valor() {
        return null;
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
//      Veiculo.super.ligar(); Mas sendo possível escolher qual método.
    }

    @Override
    public String registro() {
        return "123AFG547TR";
    }

    @Override
    public String autot() {
        return "Testando método de retorno Automovel";
    }
}