package aula06;

public class Mario {
    //Atributos
    private String nome;
    private double altura;
    private int idade;
    private int estamina;
    private int quantidadeMoedas;
    private int quantidadeVidas;

    //Métodos personalizados
    public void status() {
        System.out.println("Sobre este Mário");
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

    public void crescer(){
        this.setAltura(this.getAltura() * 2);
        //System.out.println("O "+ this.getNome() + " cresceu");
    }

    public void revigorar(){
        this.setEstamina(100);
    }

    public void morrer(){
        this.setEstamina(0);
        if(this.quantidadeVidas > 0){
            this.quantidadeVidas--;
            revigorar();
        }
    }

    public void coletarMoedas(){
        this.quantidadeMoedas++;
        if(this.quantidadeMoedas % 10 == 0){
            this.quantidadeVidas++;
        }

    }

    //Métodos especiais
    public Mario() {
        this.nome = "Mario Original";
        this.altura = 1.5;
        this.idade = 40;
        this.estamina = 100;
        this.quantidadeMoedas = 0;
        this.quantidadeVidas = 1;
    }
    public Mario(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
        this.quantidadeMoedas = 0;
        this.quantidadeVidas = 1;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getEstamina() {
        return estamina;
    }

    private void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    private int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    private void setQuantidadeMoedas(int quantidadeMoedas) {
        this.quantidadeMoedas = quantidadeMoedas;
    }

    private int getQuantidadeVidas() {
        return quantidadeVidas;
    }

    private void setQuantidadeVidas(int quantidadeVidas) {
        this.quantidadeVidas = quantidadeVidas;
    }
}
