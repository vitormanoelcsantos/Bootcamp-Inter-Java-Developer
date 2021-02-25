package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exemplo02 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564
        // 1613690674633

//      Date novaData = new Date(currentTimeMillis);
        Date novaData = new Date(1613690674633l); // Ele exibe a data de acordo com o long gerado.

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019
        // Thu Feb 18 20:24:23 BRT 2021

    }
}
