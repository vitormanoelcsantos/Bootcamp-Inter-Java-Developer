package one.innovation.digital.andrelugomes.finals;

public class CasualGamer extends Gamer{

    @Override
    public String keyboard() {
        return "Simple keyboard...";
    }

//    Final não permite sobrescrever métodos herdados
//    @Override
//    public String mouse() {
//        return super.mouse();
//    }

    public String play(final String game) {
//        Final não permite modificar as variáveis dentro do método
//        game = "WoW";

        return "Jogando "+ game;
    }
}
