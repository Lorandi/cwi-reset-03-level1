package aula09_exercicio;

import java.util.Random;

public class Jogo {
    private Personagem jogador1;
    private Personagem jogador2;

    //Métodos públicos
    public void apresentarJogadores(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        jogador1.status();
        jogador2.status();
    }

    public void jogar(){
        Random aleatorio = new Random();
        int moedasColetadas = aleatorio.nextInt(30);
        for(int i = 0; i < moedasColetadas; i++){
            jogador1.coletarMoedas();
        }
        System.out.println("Jogador 1 coletou " + moedasColetadas + " moedas");
        jogador1.status();

        moedasColetadas = aleatorio.nextInt(30);
        for(int i = 0; i < moedasColetadas; i++){
            jogador2.coletarMoedas();
        }
        System.out.println("Jogador 2 coletou " + moedasColetadas + " moedas");
        jogador2.status();

    }

    //Métodos especiais
    public Jogo() {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }
}
