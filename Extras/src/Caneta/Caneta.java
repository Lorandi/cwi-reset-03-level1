package Caneta;

public class Caneta {
    private int ponta;
    private int tamanho;
    private String nome;

    public void status(){
        System.out.println("nome: " +nome +" tamanho: "+ tamanho + " ponta: "+ ponta);
    }

    public Caneta() {
        this.nome = "Cristal";
        this.tamanho = 2;
        this.getPonta();
    }

    public Caneta(int ponta, int tamanho, String nome) {
        this.ponta = ponta;
        this.tamanho = tamanho;
        this.nome = "Bic";
    }

    public int getPonta() {
        return ponta;
    }

    public void setPonta(int ponta) {
        this.ponta = ponta;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
