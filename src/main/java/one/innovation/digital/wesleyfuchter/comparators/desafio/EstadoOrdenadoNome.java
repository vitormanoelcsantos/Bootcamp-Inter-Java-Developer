package one.innovation.digital.wesleyfuchter.comparators.desafio;

import java.util.Comparator;


public class EstadoOrdenadoNome implements Comparator<Estado> {
    @Override
    public int compare(Estado o1, Estado o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
