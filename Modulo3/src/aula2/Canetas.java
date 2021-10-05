package aula2;

public class Canetas {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

        System.out.println(" ");

        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.tampar();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();

    }

}
