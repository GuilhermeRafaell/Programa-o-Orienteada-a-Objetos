public class Pratos {
    private float precoCusto,precoVenda,tempoDePreparo;

    public Pratos(float precoCusto, float precoVenda, float tempoDePreparo) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tempoDePreparo = tempoDePreparo;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public boolean setPrecoCusto(float precoCusto) {
        if(precoCusto < 0)
            return false;
        else{
            this.precoCusto = precoCusto;
            return true;
        }
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public boolean setPrecoVenda(float precoVenda) {
        if(precoVenda < 0)
            return false;
        else{
            this.precoVenda = precoVenda;
            return true;
        }
    }

    public float getTempoDePreparo() {
        return tempoDePreparo;
    }

    public boolean setTempoDePreparo(float tempoDePreparo) {
        if(tempoDePreparo < 0)
            return false;
        else{
            this.tempoDePreparo = tempoDePreparo;
            return true;
        }
    }

}