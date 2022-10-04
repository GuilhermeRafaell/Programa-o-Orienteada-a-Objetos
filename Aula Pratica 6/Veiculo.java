public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String a){
       a = String.valueOf(ano);
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados(){
        System.out.printf("Placa: %s \tAno: %d",placa,ano);
    }

}