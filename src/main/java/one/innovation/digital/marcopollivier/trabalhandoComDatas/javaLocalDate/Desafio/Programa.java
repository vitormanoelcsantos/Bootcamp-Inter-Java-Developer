package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaLocalDate.Desafio;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2010, 5, 15, 10,00,00);
        System.out.println("A data não atualizada: " +data);
        data = data.plusYears(4);
        data = data.plusMonths(6);
        data = data.plusHours(13);
        System.out.println("A data atualizada: " +data);
        Date date = new Date();
    }
}
