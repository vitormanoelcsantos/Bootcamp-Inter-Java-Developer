package one.innovation.digital.joaopaulo.fatorial.fatorialRecursivo;

public class Programa {
    public static void main(String[] args) {
        System.out.println(fatorial(5));

    }

    public static Integer fatorial(Integer valor) {
        if (valor == 1) {
            return valor;
        } else {
            return valor * fatorial((valor - 1));
        }
    }
}
