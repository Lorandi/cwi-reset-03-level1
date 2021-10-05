package aula2;

public class SetNewMario {
    public static void main(String[] args) {
        Mario m1 = new Mario();
        m1.nome = "Mario Básico";
        m1.roupa = "Azul";
        m1.cabelo = "Longo e preto";
        m1.evoluido = false;
        m1.status();
        m1.poderes();

        System.out.println("");
        Mario m2 = new Mario();
        m2.nome = "Mario Top";
        m2.roupa = "Vermelha";
        m2.cabelo = "Careca";
        m2.evoluido = true;
        m2.status();
        m2.poderes();
    }
}
