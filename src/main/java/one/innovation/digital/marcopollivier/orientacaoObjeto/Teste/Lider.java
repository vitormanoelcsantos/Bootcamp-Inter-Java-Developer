package one.innovation.digital.marcopollivier.orientacaoObjeto.Teste;

public class Lider extends Funcionario{
    Integer salario = 4500;

    @Override
    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public Integer getSalario() {
        return salario;
    }

    private String nomeLider;


    public void exibir(Integer i){
        System.out.println(i);
    }

}
