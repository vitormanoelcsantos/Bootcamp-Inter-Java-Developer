package one.innovation.digital.andrelugomes.abstracts;

public class Programa {
    public static void main(String[] args) {

        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadadro = new Quadrado("quadadro", 10.0);
        final FormaGeometrica circulo = new Circulo();


        System.out.println(quadadro);

        System.out.println(quadadro.desenha(12,34));
        System.out.println(quadadro.nome());
        System.out.println(quadadro.area());
        System.out.println(circulo.desenha(5,8));
    }
}
