package one.innovation.digital.andrelugomes.enums;

public class Programa {
    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo(); Enum não pode ser instanciado, ele
        //é acessado de forma estática.

        // É possível acessar os Enums em outros pacotes do mesmo projeto.

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("aero"));  Tem que ser em maiúsculo
        System.out.println(TipoVeiculo.valueOf("AEREO"));


        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo FOREACH: "+tipo);
        }

        System.out.println("Código do Status OPEN :"+ Status.OPEN.getCod());
        System.out.println("Texto do Status OPEN :"+ Status.OPEN.getTexto());
    }
}
