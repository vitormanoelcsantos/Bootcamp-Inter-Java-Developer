package one.innovation.digital.marcopollivier.orientacaoObjeto.caracteristicas.heranca.Desafio;

public class Supervisor extends Funcionario{
    public Supervisor(Integer salario){
        this.setSalario(salario);
    }
    public double calculaImposto(){
        return getSalario() * 0.05;
    };
}
