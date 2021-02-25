package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.Desafio;

public class Funcionario {
    private Integer salario;
    private Integer imposto;

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public void setImposto(Integer imposto) {
        this.imposto = imposto;
    }

    public Integer getSalario() {
        return salario;
    }

    public double calculaImposto(){
        return salario * 0.01;
    }
}
