package Caneta;

public class InstanciasCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta(3,2, "Jurema");

        c1.status();

        c2.status();
    }
}
