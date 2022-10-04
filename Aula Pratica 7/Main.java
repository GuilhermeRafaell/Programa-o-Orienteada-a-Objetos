public class Main {
    public static void main(String[] args){
        double total=0;

        Funcionario vet[] = new Funcionario[5];
        vet[0] = new Gerente("Joao", "1234", 2000);
        vet[1] = new Assistente("Felipe", "3210", 500);
        vet[2] = new Vendedor("Renato", "5432", 1000, 50);
        vet[3] = new Gerente("Jessica", "7654", 2000);
        vet[4] = new Assistente("Diego", "9876", 500);

        System.out.println("Salario de cada Funcionário: ");
        
        for(int i=0; i<vet.length; i++){
            total += vet[i].calcula_Salario();

            System.out.println(vet[i].calcula_Salario());
        }
        System.out.println("\n<< Folha Salarial: "+total+" >>");
        
        for(int i=0; i<vet.length; i++){
            vet[i].mostraDados();
        }
            
    }
}
