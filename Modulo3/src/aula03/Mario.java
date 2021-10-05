package aula03;

public class Mario {
    public String nome;
    public String roupa;
    public String cabelo;

    protected double xp;

    private boolean evoluido = false;

    private double salto = 5;
    private double altura = 20;
    private double velocidade = 10 ;


    void status(){
        System.out.println("Mario foi criado");
        System.out.println("Nome:  " + this.nome);
        System.out.println("Roupa: " + this.roupa);
        System.out.println("Cabelo: " + this.cabelo);
        System.out.println("Xp: " + this.xp);

    }
   void poderes(){
        if (xp > 50){
            evoluido = true;
        }

        if(evoluido){
            salto = salto + salto * (xp/50);
            altura = altura + altura * (xp / 50);
            velocidade = velocidade + velocidade * (xp / 50);
        }else{
            salto = salto + salto * (xp / 100);
            altura = altura + altura * (xp / 100);
            velocidade = velocidade + velocidade * (xp / 100);
        }
       System.out.println("Evoluido: " + this.evoluido);
       System.out.println("Salto: " + this.salto);
       System.out.println("Altura: " + this.altura);
       System.out.println("Velocidade: " + this.velocidade);
   }
}
