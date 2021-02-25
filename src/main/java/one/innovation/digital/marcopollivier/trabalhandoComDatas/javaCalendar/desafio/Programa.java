package one.innovation.digital.marcopollivier.trabalhandoComDatas.javaCalendar.desafio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        /** Faltou verificar se é sábado ou domingo, mas vai dar muito trabalho
         estou com sono e cansado, vou deixar para o Vitor do futuro, caso ele queira tentar. Alô, Carlos!
         */

        /** Um dia após, o Vitor do futuro resolveu tentar. :) */

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataVencimento = dataAtual.plusDays(10);
        /** É necessário declarar um dia para o mês em questão, se tentar declarar dias pra o próximo
         * mês, ele não compilará.
         * Mas foi só porque no código eu coloquei para ele preencher a lista apenas o mês em questão.
         * Mas é só alterar para que ele receba todos os meses do ano, que aí dentro do for, ele irá
         * percorrer todos os dias e preencher na lista.
         */

        System.out.println(dataAtual);
        System.out.println(dataVencimento);
        // Agora eu tenho a lista de dias úteis do mês. Porém, não estou conseguindo comparar ela.
        YearMonth anoMes = YearMonth.from(dataAtual);


        // Responsável por preencher uma lista com os dias úteis
        List<LocalDate> listaDosDiasUteisDoMes = new ArrayList<>();
        for (int dia = 1; dia <= anoMes.lengthOfMonth(); dia++) {// Preenchendo a lista com os dias uteis.
            LocalDate data = anoMes.atDay(dia);
            if (!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) &&
                    !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {

                listaDosDiasUteisDoMes.add(data);
            }
        }

        if (listaDosDiasUteisDoMes.contains(dataAtual)) {
            if (dataAtual.isBefore(dataVencimento)) {
                System.out.println("A data atual não venceu, é um dia útil. Deseja pagar?");

            }
            if (dataAtual.isAfter(dataVencimento)) {
                System.out.println("A data atual venceu, é um dia útil, deseja pagar?" +
                        " Serão adicionados juros a sua conta.");

            }
        } else {
            if (dataAtual.isBefore(dataVencimento)) {
                System.out.println("A data atual não venceu, porém não é um dia útil. Aguarde até o próximo.");

            }
            if (dataAtual.isAfter(dataVencimento)) {
                System.out.println("A data atual venceu, porém não é um dia útil. Aguarde até o próximo." +
                        " Serão adicionados juros a sua conta.");

            }
        }
    }
}


/**
 * Por enquanto eu desisti, está funcionando, porém ele verifica os dois casos e sempre retorna os dois
 * eu deveria ter feito classes, mas eu não pensei nisso, porque pensei que seria algo mais fácil
 * e que por consequência eu poderia fazer tudo de uma vez na mesma classe.
 * Mas notei que não e após passar o dia inteiro trabalhando nisso, fiquei cansado e chateado, irei dar uma
 * pausa desse desafio. Outro dia eu tento, quem sabe?
 * 80% feito, se a condição estivesse certa, já estaria pronto.
 * Mas ela verifica dia por dia e já imprime o resultado, ele deveria verificar sem imprimir.
 *
 * Bom, terminou que eu consegui arrumar o problema no mesmo dia. Mais rápido do que eu esperava.
 * O problema consistia em eu inconscientemente estar tentando fazer com que o método tivesse duas responsabilidades
 * sendo que era pra cada um ter a sua. Ao separar os métodos, rodou tranquilamente. E foi necessário fazer a
 * verificação com a lista de dias não úteis.
 *
 * Na verdade, não tinha terminado, eu achei que tivesse hmm kk. Mas não estava compilando certo,
 * eu só estava substituindo sem os métodos e não estava testando eles novamente, quando fui testar de novo
 * acabei percebendo que não estava funcionando. O problema foi simples, difícil foi identificar.
 * Eu não estava comparando a data de vencimento e sim a data atual, então o valor nunca mudava, sempre seria de
 * acordo com data atual. Precisei mudar para a data de vencimento, o gênio não percebeu. *
 */





