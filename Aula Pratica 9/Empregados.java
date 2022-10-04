import java.io.Serializable;

public class Empregados implements Comparable<Empregados>, Serializable {
    private String cpf;
    private int anoNascimento;
    private float salario;

    public Empregados(String CPF, int anoNascimento) {
        setCPF(CPF);
        setAnoNascimento(anoNascimento);
    }

    public Empregados(String cpf, int anoNascimento, float salario) {
        setCPF(cpf);
        setAnoNascimento(anoNascimento);
        setSalario(salario);
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        } else
            this.salario = salario;
    }

    public int compareTo(Empregados o) {
        if (o.getAnoNascimento() > this.getAnoNascimento()) {
            return 1;
        } else if (o.getAnoNascimento() < this.getAnoNascimento()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Empregados [CPF=" + cpf + ", anoNascimento=" + anoNascimento + ", salario=" + salario + "]";
    }

}