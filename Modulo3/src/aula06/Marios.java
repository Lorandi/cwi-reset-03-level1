package aula06;

public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario();
        mario1.perdeEstamina(10);
        mario1.ganhaEstamina(5);
        mario1.revigorar();
        mario1.coletarMoedas();
        mario1.morrer();

        Mario mario2 = new Mario("Ruanito",35,1.5);
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.perdeEstamina(10);
        mario2.ganhaEstamina(20);
        mario2.crescer();


        mario1.status();
        mario2.status();
    }
}
