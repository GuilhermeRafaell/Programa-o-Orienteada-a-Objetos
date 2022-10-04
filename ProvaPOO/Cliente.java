public class Cliente{
    private String nome, CPF, RG, ultimoDestino;


    public Cliente(String nome, String cPF, String rG, String ultimoDestino) {
        this.nome = nome;
        CPF = cPF;
        RG = rG;
        this.ultimoDestino = ultimoDestino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getUltimoDestino() {
        return ultimoDestino;
    }

    public void setUltimoDestino(String ultimoDestino) {
        this.ultimoDestino = ultimoDestino;
    }

    
}