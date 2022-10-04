
public class Pizza extends Pratos{
    private String pao,carne,salada;

    public Pizza(float precoCusto, float precoVenda, float tempoDePreparo, String pao, String carne, String salada) {
        super(precoCusto, precoVenda, tempoDePreparo);
        this.pao = pao;
        this.carne = carne;
        this.salada = salada;
    }


}
