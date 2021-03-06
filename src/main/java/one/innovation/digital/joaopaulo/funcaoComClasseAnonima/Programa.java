package one.innovation.digital.joaopaulo.funcaoComClasseAnonima;

public class Programa {
    public static void main(String[] args) {
        Funcao adicionarSrNoNome = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. "+valor;
            }
        };
        System.out.println(adicionarSrNoNome.gerar("Vitor"));
    }
}
