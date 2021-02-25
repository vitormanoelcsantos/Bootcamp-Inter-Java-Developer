package one.innovation.digital.marcopollivier.orientacaoObjeto.Teste;

public class Funcionario extends Pessoa{
    private Integer salario = 0;

    public Funcionario(){}

    public Funcionario(Integer salario){
        this.salario = salario;
    };

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

   public void all(String nome, Integer idade, Integer salario){
       System.out.println("Meu nome é: " +nome+ " e minha idade é: "+idade+ " e meu salário é: "+salario);

    }
}
