package aula10_exercicio;

public class Yoshi extends Personagem {
    private int quantidadeFrutas;
    private int velocidade;

    public void comerFruta(){
        quantidadeFrutas ++;

        if(quantidadeFrutas % 2 == 0){
            velocidade *=2;
        }
    }

    @Override
    public void crescer() {
        this.setAltura(this.getAltura() + this.getAltura()*0.1 );
    }

    public Yoshi(String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.quantidadeFrutas =0;
        this.velocidade = 10;
    }

    public int getQuantidadeFrutas() {
        return quantidadeFrutas;
    }

    public void setQuantidadeFrutas(int quantidadeFrutas) {
        this.quantidadeFrutas = quantidadeFrutas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Yoshi{" +
                "quantidadeFrutas=" + quantidadeFrutas +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void status(){
        System.out.println("----------------------");
        System.out.println("Sobre este Personagem");
        System.out.println("Nome: " + getNome());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + getIdade());
        System.out.println("quantidadeFrutas = " + quantidadeFrutas);
        System.out.println("velocidade = " + velocidade);
    }
}
