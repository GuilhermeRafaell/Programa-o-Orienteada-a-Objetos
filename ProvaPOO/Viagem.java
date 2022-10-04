import java.util.Date;
public class Viagem {
    private String ClientePrincipal, origem, destino, motivoViagem;
    private Date dataDaPartida;
    private float tempoViagem;

    
    public Viagem(String clientePrincipal, String origem, String destino, String motivoViagem, Date dataDaPartida,
            float tempoViagem) {
        ClientePrincipal = clientePrincipal;
        this.origem = origem;
        this.destino = destino;
        this.motivoViagem = motivoViagem;
        this.dataDaPartida = dataDaPartida;
        this.tempoViagem = tempoViagem;
    }

    public String getClientePrincipal() {
        return ClientePrincipal;
    }
    public void setClientePrincipal(String clientePrincipal) {
        ClientePrincipal = clientePrincipal;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getMotivoViagem() {
        return motivoViagem;
    }
    public void setMotivoViagem(String motivoViagem) {
        this.motivoViagem = motivoViagem;
    }
    public Date getDataDaPartida() {
        return dataDaPartida;
    }
    public void setDataDaPartida(Date dataDaPartida) {
        this.dataDaPartida = dataDaPartida;
    }
    public float getTempoViagem() {
        return tempoViagem;
    }
    public void setTempoViagem(float tempoViagem) {
        this.tempoViagem = tempoViagem;
    }

    public String retornaDados() {
        return "Viagem [ClientePrincipal=" + ClientePrincipal + ", dataDaPartida=" + dataDaPartida + ", destino="
                + destino + ", motivoViagem=" + motivoViagem + ", origem=" + origem + ", tempoViagem=" + tempoViagem
                + "]";
    }

    
}
