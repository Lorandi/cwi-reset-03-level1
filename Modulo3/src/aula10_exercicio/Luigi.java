package aula10_exercicio;

public class Luigi extends Personagem {
    public Luigi(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    @Override
    public void crescer() {
        this.setAltura(this.getAltura() + this.getAltura()*0.75 );
    }

    public void voar(){
        System.out.println("Luigi está voando");
    }
}
