package aula05;

public class Mario {
    //Atributos
    private String nome;
    private String roupa;
    private String cabelo;

    private int estamina;
    private double altura;
    private double idade;

    //Métodos personalizados
    public void status() {
        System.out.println("Sobre este Mário");
        System.out.println("Nome: " + getNome());
        System.out.println("Roupa: " + getRoupa());
        System.out.println("Cabelo: " + getCabelo());

        System.out.println("Estamina: " + getEstamina());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + getIdade());
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



    //Métodos especiais
    public Mario(String nome, String roupa, String cabelo) {
        this.nome = nome;
        this.roupa = roupa;
        this.cabelo = cabelo;
        this.estamina = 100;
        this.altura = 1.5;
        this.idade = 40;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getRoupa() {
        return roupa;
    }

    private void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    private String getCabelo() {
        return cabelo;
    }

    private void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
