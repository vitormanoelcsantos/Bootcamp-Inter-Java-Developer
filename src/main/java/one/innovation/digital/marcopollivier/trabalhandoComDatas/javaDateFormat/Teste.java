package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Teste {
    public static void main(String[] args) {
        Date d = new Date();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("pt", "BR"));

        System.out.println("en: " + df1.format(d));
        System.out.println("pt: " + df2.format(d));
    }
}
