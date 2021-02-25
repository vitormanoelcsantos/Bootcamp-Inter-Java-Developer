package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.exemplo03.equals;

public class Programa {
    public static void main(String[] args) {
        Carro carro1 = new Carro("EcoSport", "Ford", 1000);
        Carro carro2 = new Carro("EcoSport", "Ford", 1000);

        if (carro1.equals(carro2)){
            System.out.println("É igual");
        }else {
            System.out.println("Não é");
        }
    }
}
