package aula10_soobrecarga;

public class aula10_sobrecarga {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir("Vai apanhar");

        c.reagir(11,45);
        c.reagir(19,00);

        c.reagir(true);
        c.reagir(false);

        c.reagir(4, 4.5f);


    }
}
