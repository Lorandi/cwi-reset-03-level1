package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    protected int carga;
    private boolean tampada = true;

    public void status(){
        System.out.println("Criada uma caneta");
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada == true){
            System.out.println("Erro. Caneta tampada. Não posso rabiscar");
        }else{
            System.out.println("Estou pronta para rabiscar");
        }
    };

    public void tampar() {
        this.tampada = true;
        System.out.println("Tampar caneta!");

    };

    public void destampar() {
        this.tampada = false;
        System.out.println("Destampar caneta!");
    };
}

