package one.innovation.digital.andrelugomes.debug;

import one.innovation.digital.andrelugomes.debug.imc.CalculadorDeIMC;
import one.innovation.digital.andrelugomes.debug.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Vitor", 1.7, 65.00);

        final var calculadorDeImc = new CalculadorDeIMC();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}