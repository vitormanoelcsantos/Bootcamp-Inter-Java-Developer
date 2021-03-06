package one.innovation.digital.joaopaulo.funcaoAltaOrdem;

public class Programa {
    public static void main(String[] args) {
        Calculo soma = ((a, b) -> a + b);
        Calculo subtracao = ((a, b) -> a - b);
        Calculo divisao = ((a, b) -> a / b);
        Calculo multiplicacao = ((a, b) -> a * b);

        System.out.println(executarOperaca(soma, 5, 5));
        System.out.println(executarOperaca(subtracao, 5, 5));
        System.out.println(executarOperaca(divisao, 5, 5));
        System.out.println(executarOperaca(multiplicacao, 5, 5));

    }

    public static Integer executarOperaca(Calculo calculo, Integer c, Integer d){
        return calculo.calcular(c, d);
    }

    @FunctionalInterface
    interface Calculo{
        public Integer calcular(Integer a, Integer b);
    }
}
