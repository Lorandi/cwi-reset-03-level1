package aula07;

public class Marios {
    public static void main(String[] args) {
        Personagem mario= new Personagem("Mario", 40, 1.60);
        mario.saltar();

        Personagem luigi = new Personagem("Luigi", 40, 1.80);
        luigi.saltar();


        mario.status();
        luigi.status();
    }
}
