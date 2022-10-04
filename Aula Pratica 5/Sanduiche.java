public class Sanduiche extends Pratos{
    private String molho, recheio, borda;

    public Sanduiche(float precoCusto, float precoVenda, float tempoDePreparo, String molho, String recheio,
            String borda) {
        super(precoCusto, precoVenda, tempoDePreparo);
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }

}
