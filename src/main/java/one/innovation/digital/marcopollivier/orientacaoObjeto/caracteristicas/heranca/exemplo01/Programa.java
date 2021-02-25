package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.exemplo01;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);
        System.out.println("O carro está: " +carro.acelerar());

        Motocicleta moto = new Motocicleta();
        moto.setMarca("Ducati");
        moto.setModelo("StreetFighter");
        moto.setCilindradas("850");
        moto.acelerar();
        System.out.println("A moto está: " +moto.acelerar());
    }
}
