package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDate;

public class Exemplo02 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2019-07-14

        System.out.println(ontem);
        // 2019-07-13

    }
}
