package aula05;

public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario("Moah", "Azul","Preto");
        mario1.perdeEstamina(10);
        mario1.ganhaEstamina(5);


        Mario mario2 = new Mario("Ruanito", "Verde","Raspado");
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.setEstamina(200);
        mario2.perdeEstamina(10);
        mario2.ganhaEstamina(20);
        mario2.crescer();


        mario1.status();
        mario2.status();
    }
}
