import java.util.*;

public class Pedidos {
    private String cpf;
    private Date date;
    private float  taxaServico, valorTotalPratos, valorTotalPedidos;
    private List<Pratos> pratos=new ArrayList<Pratos>();

    public Pedidos(String cpf, Date date) {
        this.cpf = cpf;
        this.date = date;
    }
    public void fazPrato(Pratos pratos){
        this.pratos.add(pratos);
        valorTotalPratos+=pratos.getPrecoVenda();
        //setValorTotalPratos(getValorTotalPratos()+pratos.getPrecoVenda());
    }
    
    public float calculaTaxa(){
        return valorTotalPratos*=0.10;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDate() {
        return date;
    }
    public boolean setDate(Date date) {
        this.date = date;
        return true;
    }
    public float getTaxaServico() {
        return taxaServico;
    }
    public boolean setTaxaServico(float taxaServico) {
        if(taxaServico < 0)
            return false;
        else{
            this.taxaServico = taxaServico;
            return true;
        }
    }
    public float getValorTotalPratos() {
        return valorTotalPratos;
    }
    public boolean setValorTotalPratos(float valorTotalPratos) {
        if(valorTotalPratos < 0)
            return false;
        else{
            this.valorTotalPratos = valorTotalPratos;
            return true;
        }
    }
    public float getValorTotalPedidos() {
        return valorTotalPratos+calculaTaxa();
    }
    public boolean setValorTotalPedidos(float valorTotalPedidos) {
        if(valorTotalPedidos < 0)
            return false;
        else{
            this.valorTotalPedidos = valorTotalPedidos;
            return true;
        }
    }
    public List<Pratos> getPratos() {
        return pratos;
    }
    public void setPratos(List<Pratos> pratos) {
        this.pratos = pratos;
    }
 
}