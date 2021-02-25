package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.Desafio;

public class Programa {
    public static void main(String[] args) {
        Funcionario atendente = new Atendente(1000);
        Funcionario supervisor = new Supervisor(1000);
        Funcionario gerente = new Gerente(1000);

        System.out.println("O imposto atendente será: " +atendente.calculaImposto());
        System.out.println("O imposto do supervisor será: " +supervisor.calculaImposto());
        System.out.println("O imposto do gerente será: " +gerente.calculaImposto());
    }
}
