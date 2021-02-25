package one.innovation.digital.marcopollivier.orientacaoObjeto.Teste;

public class SubLider extends Lider{
    Integer salario = 3500;

    @Override
    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public Integer getSalario() {
        return salario;
    }


}
