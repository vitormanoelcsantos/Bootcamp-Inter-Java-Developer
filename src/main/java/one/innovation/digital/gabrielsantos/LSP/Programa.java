package one.innovation.digital.gabrielsantos.LSP;

public class Programa {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(10);
        r.setLargura(5);

        System.out.println("A área é: " +r.area());
    }
}
