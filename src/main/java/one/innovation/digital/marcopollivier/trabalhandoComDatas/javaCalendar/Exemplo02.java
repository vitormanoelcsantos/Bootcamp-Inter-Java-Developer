package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo02 {
    /**
     * Exemplo de utilização da classe Calendar
     */

    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();

        System.out.println("A data corrente é : " + data.getTime());
        // A data corrente é : Sun Jul 14 20:50:31 BRT 2019

        data.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + data.getTime());
        // 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019

        data.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + data.getTime());
        // 4 meses depois: Tue Oct 29 20:50:31 BRT 2019

        data.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + data.getTime());
        // 2 anos depois: Fri Oct 29 20:50:31 BRT 2021

        // cada alteração é feita a partir de cada ação e não da data inicial
    }
}
