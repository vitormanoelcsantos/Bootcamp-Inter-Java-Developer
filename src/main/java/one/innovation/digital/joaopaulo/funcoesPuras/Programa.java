package one.innovation.digital.joaopaulo.funcoesPuras;

import java.util.function.BiPredicate;

public class Programa {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior = (primeiroValor, segundoValor) ->
                primeiroValor > segundoValor;
        System.out.println("O primeiro valor é maior que o segundo? " +verificarSeEMaior.test(6, 12));
        System.out.println("O primeiro valor é maior que o segundo? " +verificarSeEMaior.test(6, 12));


//        Integer a, b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Informe o primeiro valor valor: ");
//        a = scanner.nextInt();
//        System.out.println("Informe o primeiro valor valor: ");
//        b = scanner.nextInt();
//        System.out.println("O primeiro valor é maior que o segundo? " +verificarSeEMaior.test(a, b));
    }
}
