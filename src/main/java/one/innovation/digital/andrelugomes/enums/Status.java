package one.innovation.digital.andrelugomes.enums;

public enum Status {
    OPEN(13, "aberto"),
   CLOSE(02, "Fechado");

//    DIA(8, "NOITE"); É como se fosse um construtor para o próprio Enum, sempre quando criar for utilizar
//    de um método, terá que passar as informações do "construtor" logo abaixo.

    private int cod;
    private String texto;

    Status(final int cod, final String texto) { // "Construtor"

        this.cod = cod;
        this.texto = texto;
    }
//    Sendo possível recuperar o código e o texto desse Enum
    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}