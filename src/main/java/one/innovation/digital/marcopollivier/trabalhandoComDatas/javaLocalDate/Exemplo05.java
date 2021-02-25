package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class Exemplo05 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2019-07-17T01:02:28.076

    }
}
