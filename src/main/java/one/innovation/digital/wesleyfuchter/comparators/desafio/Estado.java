package one.innovation.digital.wesleyfuchter.comparators.desafio;

public class Estado implements Comparable<Estado>{
    private final String nome;
    private final Integer ddd;

    public String getNome() {return nome;}
    public Integer getDdd() {
        return ddd;
    }

    public Estado(String nome, Integer ddd){
        this.nome = nome;
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Estado: " + nome + ", DDD: " + ddd + "\n";
    }

    @Override
    public int compareTo(Estado o) {
        return this.getDdd() - o.getDdd();
    }
}
