import java.util.ArrayList;

public class DadosEmpregados {

    private static ArrayList<Empregados> empregado = new ArrayList<Empregados>();

    public static void inicializaEmpregados(){
        empregado=(ArrayList<Empregados>)Persist.recuperar("empregado.dat");
        if(empregado==null){
            empregado=new ArrayList<Empregados>();
        }
    }

    public static void inserir(Empregados x) {
        empregado.add(x);
        Persist.gravar(empregado, "empregado.dat");
        Persist.gravar(empregado, "empregado.txt");
    }

    public Empregados buscar(String cpf) {
        Empregados x = null;
        for (Empregados objeto : empregado) {
            if (objeto.getCPF().equals(cpf)) {
                x = objeto;
                break;
            }
        }
        return x;
    }

    public Empregados buscar_viaSalario(float valor) {
        Empregados x = null;
        for (Empregados objeto : empregado) {
            if (objeto.getSalario() > valor) {
                System.out.println(objeto);
            }
        }
        return x;
    }
    public static void listar() {
        for (Empregados objeto : empregado) System.out.println(objeto);
    }
    public boolean remover(String cpf) {
        // remove um empregado utilizando o metodo buscar ja implementado
        Empregados x = this.buscar(cpf);
        if (x != null) {
            empregado.remove(x);
            return true;
        } else {
            return false;
        }
    }
}
