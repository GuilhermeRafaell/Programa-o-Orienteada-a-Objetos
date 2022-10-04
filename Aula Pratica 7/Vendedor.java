public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    @Override
    public double calcula_Salario() {
        return getSalario_base() + comissao;
    }

    public void mostraDados(){
        System.out.println("Funcionario: (Matricula = "+ getMatricula() +"; Nome = "+getNome()+"; Salario Base = "+getSalario_base()+ 
        "; Comissão = "+comissao+")");
    }
    
}
