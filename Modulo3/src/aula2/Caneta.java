package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Criada uma caneta");
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true){
            System.out.println("Erro. Caneta tampada. Não posso rabiscar");
        }else{
            System.out.println("Estou pronta para rabiscar");
        }
    };

    void tampar() {
        this.tampada = true;
        System.out.println("Tampar caneta!");

    };

    void destampar() {
        this.tampada = false;
        System.out.println("Destampar caneta!");
    };
}
