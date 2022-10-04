public class TestaVeiculos {
    public static void main(String[] args) throws Exception {
        
        Veiculo[] qE = new Veiculo[3];
        qE[0] = new Caminhao("def321",1997,4);
        qE[1] = new Onibus("ghi456",1999,28);
        qE[2] = new Veiculo("abc123",2001);

        for(int i=0; i<qE.length; i++){
            qE[i].exibirDados();
        }
    }
}
