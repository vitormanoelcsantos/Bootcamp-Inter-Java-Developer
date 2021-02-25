package one.innovation.digital.andrelugomes.finals;

public class Programa {
    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

//      Final não permite o valor dela ser alterado
//      game = "WoW";

        System.out.println(casualGamer.play(game));
        System.out.println(gamer.keyboard());


    }
}
