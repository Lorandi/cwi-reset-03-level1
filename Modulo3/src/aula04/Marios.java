package aula04;

public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario("Moah", "Azul","Preto");
        mario1.status();

        Mario mario2 = new Mario("Ruanito", "Verde","Caspado");
        mario2.setXp(45);
        mario2.setAltura(2);
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.setEstamina(200);
        mario2.status();
    }
}
