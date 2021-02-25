package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.Desafio;

public class Gerente extends Funcionario{
    public Gerente(Integer salario){
        this.setSalario(salario);
    }
    public double calculaImposto(){
        return getSalario() * 0.1;
    }
}
