package aula08;

public class Jogando {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 40, 1.60);

        Personagem luigi = new Personagem("Luigi", 40, 1.80);


        Jogo Novo = new Jogo();
        Novo.apresentarJogadores(mario, luigi);
        Novo.jogar();
    }
}
