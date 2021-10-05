package aula10_exercicio;

public abstract class Personagem {
    //Atributos
    private String nome;
    private double altura;
    private int idade;
    private int estamina;
    private int quantidadeMoedas;
    private int quantidadeVidas;

    public Personagem(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
        this.quantidadeMoedas = 0;
        this.quantidadeVidas = 1;
    }

    //Métodos personalizados
    public void status() {
        System.out.println("----------------------");
        System.out.println("Sobre este Personagem");
        System.out.println("Nome: " + getNome());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + getIdade());
        System.out.println("Estamina: " + getEstamina());
        System.out.println("Moedas: " + getQuantidadeMoedas());
        System.out.println("Vidas: " + getQuantidadeVidas());
        System.out.println("");
    }

    public void perdeEstamina(int perde) {
        if (this.getEstamina() > perde) {
            this.setEstamina(this.getEstamina() - perde);
            //System.out.println("Perdeu " + perde + " pontos de estamina");
        } else {
            this.setEstamina(0);
            //System.out.println("Está com zero estamina");
        }
    }

    public void ganhaEstamina(int ganha) {
        this.setEstamina(this.getEstamina() + ganha);
        //System.out.println("Ganhou " + ganha + " pontos de estamina");
        if (this.getEstamina() >= 100) {
            setEstamina(100);
        }
    }

    public abstract void crescer();

    public void revigorar() {
        this.setEstamina(100);
    }

    public void morrer() {
        this.setEstamina(0);
        if (this.quantidadeVidas > 0) {
            this.quantidadeVidas--;
            revigorar();
        }
    }

    public void coletarMoedas() {
        this.quantidadeMoedas++;
        if (this.quantidadeMoedas % 10 == 0) {
            this.quantidadeVidas++;
        }

    }

    public void saltar() {
        System.out.println(this.getNome() + " pula uma altura de " + this.altura * 0.5);
    }

    public void saltar(double objeto){
        System.out.println(this.getNome() + " pula uma altura de " + (objeto + (objeto * 0.5)));

    }

    //Métodos especiais


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    public void setQuantidadeMoedas(int quantidadeMoedas) {
        this.quantidadeMoedas = quantidadeMoedas;
    }

    public int getQuantidadeVidas() {
        return quantidadeVidas;
    }

    public void setQuantidadeVidas(int quantidadeVidas) {
        this.quantidadeVidas = quantidadeVidas;
    }
}
