package aula04;

public class Mario {
    private String nome;
    private String roupa;
    private String cabelo;

    protected double xp;

    private boolean evoluido;

    private int  estamina;
    private double altura;
    private double idade;

    public Mario(String nome, String roupa, String cabelo){
        this.nome = nome;
        this.roupa = roupa;
        this.cabelo = cabelo;

        this.xp = 30;

        this.evoluido = false;

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

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
        if(xp > 40){
            this.evoluido = true;
        }
    }

    public boolean isEvoluido() {
        return evoluido;
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

    public void status(){
        System.out.println("Sobre este Mário");
        System.out.println("Nome: "+ getNome() );
        System.out.println("Roupa: " + getRoupa());
        System.out.println("Cabelo: " + getCabelo());
        System.out.println("Xp: " + this.xp);
        System.out.println("Evoluido: " + isEvoluido());
        System.out.println("Estamina: " + getEstamina());
        System.out.println("Altura: "+ altura);
        System.out.println("Idade: " + getIdade());
        System.out.println("");
    }
}
