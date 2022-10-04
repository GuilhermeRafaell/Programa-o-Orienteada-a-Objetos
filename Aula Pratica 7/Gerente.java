public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcula_Salario() {
        return getSalario_base()*2;
    }
    
}
