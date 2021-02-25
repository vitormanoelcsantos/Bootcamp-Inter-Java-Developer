package one.innovation.digital.andrelugomes.condicionais.operadores;

public class Incremento {
    public static void main(String[] args) {
        var numero = 1;
        numero +=1;

//      ++numero ele primeiro incrementa depois imprime
        System.out.println(++numero);

//      numero-- ele primeiro imprime e depois decrementa
        System.out.println(numero--);
        System.out.println(numero);

//
    }
}
