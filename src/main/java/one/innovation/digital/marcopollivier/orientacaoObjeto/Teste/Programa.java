package one.innovation.digital.marcopollivier.orientacaoObjeto.Teste;

public class Programa {
    public static void main(String[] args) {

        /** */
        Lider gerente = new Lider();

        gerente.all("Vitor", 21, gerente.getSalario());

        /** */
        Lider sl = new SubLider();
        sl.all("Eduarda", 18, sl.getSalario());


        /** */
        Funcionario atendente = new Funcionario();
        atendente.setSalario(1100);
        atendente.all("Ana Paula", 52, atendente.getSalario());

//        System.out.printf("O nome é: %s e a idade é: %d", "Marcela Nogueira", 32);

    }
}
