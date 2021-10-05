package aula2;

public class Mario {
    String nome;
    String roupa;
    String cabelo;

    boolean evoluido;

    int salto;
    double altura;
    int velocidade;

    void status(){
        System.out.println("Mario foi criado");
        System.out.println("Nome:  " + this.nome);
        System.out.println("Roupa: " + this.roupa);
        System.out.println("Cabelo: " + this.cabelo);
        System.out.println("Evoluido: " + this.evoluido);
    }
   void poderes(){
        if(evoluido){
            salto = 40;
            altura = 1.5;
            velocidade = 10;
        }else{
            salto = 20;
            altura = 1;
            velocidade = 2;
        }
       System.out.println("Salto: " + this.salto);
       System.out.println("Altura: " + this.altura);
       System.out.println("Velocidade: " + this.velocidade);
   }
}
