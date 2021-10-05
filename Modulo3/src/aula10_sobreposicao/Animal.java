package aula10_sobreposicao;

public abstract class Animal {
    protected float peso;
    protected float idade;
    protected float membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void olhosAbertos(){
        System.out.println("olhos abertos");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getMembros() {
        return membros;
    }

    public void setMembros(float membros) {
        this.membros = membros;
    }
}
