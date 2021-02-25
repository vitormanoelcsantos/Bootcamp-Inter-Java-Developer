package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaDateFormat.Desafio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Programa {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A data não formatada: " +data);
        String dateToStr = DateFormat.getInstance().format(data);
        System.out.println("A data formatada para String: " +dateToStr);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:MMMM");
        String dataFormatada = sdf.format(data);
        System.out.println("A data formatada: " +dataFormatada);
    }
}
