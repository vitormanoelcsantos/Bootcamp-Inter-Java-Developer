package one.innovation.digital.joaopaulo.funcaoComLambda;

public class Programa {
    public static void main(String[] args) {
        Funcao adicionarSrNoNome = valor -> "Sr. "+valor;
        System.out.println(adicionarSrNoNome.gerar("Vitor"));
    }
}
//    Forma verbosa de utilizar uma interface funcional
//        Funcao adicionarSrNoNome = new Funcao() {
//            @Override
//            public String gerar(String valor) {
//                return "Sr. "+valor;
//            }
//        };
//        System.out.println(adicionarSrNoNome.gerar("Vitor"));
//    }

