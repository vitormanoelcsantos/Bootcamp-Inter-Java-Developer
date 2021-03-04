package one.innovation.digital.wesleyfuchter.comparators.desafio;

import java.util.Comparator;

public class EstadoReversoDDD implements Comparator<Estado> {
    @Override
    public int compare(Estado o1, Estado o2) {
        return o2.getDdd() - o1.getDdd();
    }
}
