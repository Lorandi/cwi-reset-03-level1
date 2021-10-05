# Aula 08 - Relacionamento de Agregação

Assista aos vídeos: 

  1. [Relacionamento de Agregação](https://youtu.be/ERdvijGtrq0?t=61)
  1. [Agregação entre Objetos com Java](https://youtu.be/8R9RpqpXI_c?t=34)

---

## Exercício

Baseado no conteúdo visto nas últimas aulas, vamos criar um simulador simples do jogo onde os personagens apenas vão coletar moedas ao longo da execução. Para isso, vamos criar a classe que simula uma execução do jogo contendo os 2 personagens no cenário. Neste simulador, vamos coletar um numero de moedas aleatório e imprimir os dados dos jogadores no console no termino da partida. Siga o roteiro de implementação abaixo.

### Nivel 1
* Crie a classe `Jogo` com o seguinte modelo
  * Deverá conter dois jogadores (`jogador1` e `jogador2`), ambos do tipo `Personagem`.
  * Deverá ter um construtor que recebe os dois personagens e os armazene no `jogador1` e `jogador2`.
  * Deverá ter um método que imprime os dados dos personagens do jogo.

### Nível 2
  * Deverá ter um método `jogar()` que coloca os dois jogadores a coletar moedas em um número aleatório entre 0 e 30 de repetições.
    * Deverá ser impressa a quantidade de vezes em que os jogadores coletaram moedas.
    * No final da execução deste método, deverão ser impressos os dados dos personagens do jogo para que possam ser verificadas a vida e a quantidade de moedas adquiridas ao longo da partida.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e do Luigi, crie uma instancia do jogo, simule o a execução do jogo por meio do método `jogar()` e teste sua implementação.

```java
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
```

```java
public class Jogando {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 40, 1.60);

        Personagem luigi = new Personagem("Luigi", 40, 1.80);


        Jogo Novo = new Jogo();
        Novo.apresentarJogadores(mario, luigi);
        Novo.jogar();
    }
}
```


   