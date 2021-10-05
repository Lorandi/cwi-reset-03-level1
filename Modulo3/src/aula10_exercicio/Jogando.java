package aula10_exercicio;

public class Jogando {
    public static void main(String[] args) {
        // Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        luigi.crescer();

        luigi.status();

        mario.saltar();
        mario.saltar(2);



    }
}
