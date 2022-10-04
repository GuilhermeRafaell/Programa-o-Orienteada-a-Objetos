import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // List<Pedidos> pedidos = new ArrayList<Pedidos>();
        Sanduiche sanduiche = new Sanduiche(10f, 10f, 10, "molho", "recheio", "borda");
        Pizza pizza = new Pizza(10f, 10f, 10, "pao", "carne", "salada");
        int opcao = 1, cont = 1;

        Scanner reader = new Scanner(System.in);
        System.out.println("Bem vindo a Lanchonete Gui's\n\n");

        while (opcao != 0) {
            System.out.println("\n"+cont+"º Pedido ");
            cont++;
            System.out.println("Posso lhe ajudar, o que deseja pedir?");
            System.out.println("Para começarmos por gentileza digite seu CPF logo abaixo:");
            Date date = new Date();
            String cpf =reader.nextLine();
            Pedidos pe = new Pedidos(cpf, date);

            int op = 0;

            while (op != 3) {
                System.out.println("1-pizza, 2-sanduiche, 3-Fechar conta e mostrar valor, 0-Para sair.");
                op = reader.nextInt();

                if (op == 1) {
                    pe.fazPrato(pizza);
                    System.out.println("\nOK , valor da conta: " + pe.getValorTotalPratos());
                } else if (op == 2) {
                    pe.fazPrato(sanduiche);
                    System.out.println("\nOK , valor da conta: " + pe.getValorTotalPratos());
                }
                if(op==0){
                    break;
                }
            }
            if(op==0){
                break;
            }
            System.out.println("\n\nValor: "+pe.getValorTotalPedidos());
        }
        reader.close();
    }
}

/*
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<Pedidos> pedidos = new ArrayList<Pedidos>();
        Sanduiche sanduiche = new Sanduiche(10f, 10f, 10, "molho", "recheio", "borda");
        Pizza pizza = new Pizza(10f, 10f, 10, "pao", "carne", "salada");
        int op, cont = 1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Lanchonete Gui's\n\n");
        System.out.println("O que deseja fazer?");

        menu();
        op = reader.nextInt();
        while (op != 0) {
            switch (op) {
                case 1:// fazer um novo pedido
                    System.out.println("Digite o seu cpf:");
                    reader.reset();
                    String cpf=reader.next();
                    Date date = new Date();
                    Pedidos pe = new Pedidos(cpf, date);
                    pedidos.add(pe);
                    System.out.printf("O número do seu pedido é %d, não se esqueça desse número.\n", cont);
                    cont++;
                    break;
                case 2:// adicionar pratos
                    System.out.println("Digite o número do pedido:");
                    pe = pedidos.get(reader.nextInt() - 1);
                    System.out.println("pizza ou sanduiche?TUDO MINUSCULO");
                    if (reader.nextLine() == "pizza") {
                        pe.fazPrato(pizza);
                    } else if (reader.nextLine() == "sanduiche") {
                        pe.fazPrato(sanduiche);
                    }else{
                        System.out.println("Opção não encontrada.");
                    }
                    break;
                case 3:
                System.out.println("Digite o número do pedido:");
                int teste=reader.nextInt();
                pe = pedidos.get(teste-1);
                System.out.println("O valor final é "+pe.getValorTotalPedidos());
                    break;
                default:
                    break;
            }
            menu();
            op = reader.nextInt();
        }
        reader.close();
    }

    public static void menu() {
        System.out.println("1-fazer um novo pedido");
        System.out.println("2-Adicionar pratos ao pedido atual");
        System.out.println("3-valor total do pedido");
        System.out.println("0-sair");
    }

}
/*
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        

        List<Pedidos> pedidos = new ArrayList<Pedidos>();
        Sanduiche sanduiche=new Sanduiche(10f, 10f, 10, "molho", "recheio", "borda");
        Pizza pizza=new Pizza(10f, 10f, 10, "pao", "carne", "salada");


        Date date=new Date();
        Pedidos pe=new Pedidos("70122924665",date);
        pedidos.add(pe);
        pe=pedidos.get(0);
        pe.fazPrato(sanduiche);
        pe.fazPrato(pizza);
        System.out.println(pe.getValorTotalPedidos());

    }

    
}*/