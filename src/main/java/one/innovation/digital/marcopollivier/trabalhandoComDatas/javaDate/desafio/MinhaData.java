package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaDate.desafio;

import java.util.Date;

public class MinhaData {
    public static void main(String[] args) {
        Date myDate = new Date("Aug 01, 1999");
        Date newDate = new Date("May 15, 2010");
//      System.out.println(myDate.toInstant().toEpochMilli()); Retorno: 933476400000
//      Descobri a data dessa forma, mesmo estando depreciado

        if (myDate.after(newDate)) {
            System.out.println("É posterior");
        } else {
            System.out.println("É anterior");
        }
    }
}
