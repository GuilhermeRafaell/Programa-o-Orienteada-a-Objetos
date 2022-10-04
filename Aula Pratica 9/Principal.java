import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        DadosEmpregados empregados = new DadosEmpregados();
        DadosEmpregados.inicializaEmpregados();

        // D
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o cpf e o ano de nascimento, logo após o salario");
            DadosEmpregados.inserir(new Empregados(reader.next(), reader.nextInt(), reader.nextFloat()));
        }

        /*
         * PARA TESTES DadosEmpregados.inserir(new Empregados("001", 2000,400f));
         * DadosEmpregados.inserir(new Empregados("002", 2001,470f));
         * DadosEmpregados.inserir(new Empregados("003", 2002,450f));
         * DadosEmpregados.inserir(new Empregados("004", 2003,400f));
         * DadosEmpregados.inserir(new Empregados("005", 2004,450f));
         */
        DadosEmpregados.listar();
        System.out.println();

        // E
        System.out.println("digite o cpf para ser pesquisado.");
        System.out.println(empregados.buscar(reader.next()) + "\n");

        // F
        System.out.println("Digite o valor do salário para ser pesquisado: ");
        empregados.buscar_viaSalario(reader.nextFloat());
        reader.close();
    }
}