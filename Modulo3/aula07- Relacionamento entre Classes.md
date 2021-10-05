# Aula 07 - Relacionamento entre Classes

Assista aos vídeos: 

  1. [Relacionamento entre Classes](https://youtu.be/GLHbxDU9iBA?t=98)
  1. [Objetos Compostos em Java](https://youtu.be/BfrbCQ3XcrA?t=34)

---

## Exercício

![Luigi](https://lh6.ggpht.com/-KFZvUxoCM3w/TjdVSdTBbYI/AAAAAAAAA04/jy-GNdnHi40/Luigi_thumb%25255B1%25255D.png?imgmax=800)

Em **Mario Bros**, Luigi é apenas uma troca de paleta de cores de Mario com os mesmos controles e habilidades sem diferenças físicas. Mario e Luigi são retratados como encanadores onde tentam se livrar de monstros nos esgotos.

Em **Super Mario Bros**, os irmãos vão ao Reino do Cogumelo para salvar a Princesa Toadstool que fora capturada pelo terrível Bowser. Neste jogo Luigi tinha os mesmos poderes de Mario e mesma velocidade, incluindo Power-Ups. Também uma troca de paleta apenas para ter um modo de dois jogadores. Em **The Lost Levels**, não havia a opção de dois jogadores, mas Luigi estava lá podendo saltar mais alto que Mario.

Já em **Super Mario Bros. 2**, Luigi teve sua primeira aparição com um personagem diferente de Mario. Ele também podia saltar mais alto que Mario, mas notava-se uma diferença em seus gráficos. Luigi se mostrou mais alto e magro que o irmão bigodudo.

### Atividade

Vamos evoluir o nosso projeto do Mario que estamos construindo desde a segunda aula. A partir de agora, vamos incluir o personagem do Luigi nos nosso cenários e aplicar regras que implementem a diferença que ele foi ganhando com relação Mario ao longo do tempo, conforme descrição acima. Para tal, codifique as seguintes mudanças:
* Renomear a classe `Mario` para `Personagem`.
* Elemine o construtor default (sem argumentos).
* Criar um método `saltar()` que imprime a altura que o personagem pula.
   * Quando o personagem se chamar "Mario", ele pula uma altura equivalente a 50% da sua própria altura.
   * Quando o personagem se chamar "Luigi", ele pula o dobro da sua altura.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e do Luigi e teste sua implementação.


```java
//Classe Personagem;

public class Personagem {
    //Atributos
    private String nome;
    private double altura;
    private int idade;
    private int estamina;
    private int quantidadeMoedas;
    private int quantidadeVidas;

    //Métodos personalizados
    public void status() {
        System.out.println("----------------------");
        System.out.println("Sobre este Personagem");
        System.out.println("Nome: " + getNome());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + getIdade());
        System.out.println("Estamina: " + getEstamina());
        System.out.println("Moedas: " + getQuantidadeMoedas());
        System.out.println("Vidas: " + getQuantidadeVidas());
        System.out.println("");
    }

    public void perdeEstamina(int perde) {
        if (this.getEstamina() > perde) {
            this.setEstamina(this.getEstamina() - perde);
            //System.out.println("Perdeu " + perde + " pontos de estamina");
        } else {
            this.setEstamina(0);
            //System.out.println("Está com zero estamina");
        }
    }

    public void ganhaEstamina(int ganha) {
        this.setEstamina(this.getEstamina() + ganha);
        //System.out.println("Ganhou " + ganha + " pontos de estamina");
        if (this.getEstamina() >= 100) {
            setEstamina(100);
        }
    }

    public void crescer(){
        this.setAltura(this.getAltura() * 2);
        //System.out.println("O "+ this.getNome() + " cresceu");
    }

    public void revigorar(){
        this.setEstamina(100);
    }

    public void morrer(){
        this.setEstamina(0);
        if(this.quantidadeVidas > 0){
            this.quantidadeVidas--;
            revigorar();
        }
    }

    public void coletarMoedas(){
        this.quantidadeMoedas++;
        if(this.quantidadeMoedas % 10 == 0){
            this.quantidadeVidas++;
        }

    }

    public void saltar() {
        if (this.getNome() == "Mario"){
            System.out.println(this.getNome() + " pula uma altura de " + this.altura * 0.5);
        }

        if (this.nome.equals("Luigi")){
            System.out.println(this.getNome() + " pula uma altura de " + +this.altura * 2);
        }

    }

    //Métodos especiais
    public Personagem(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
        this.quantidadeMoedas = 0;
        this.quantidadeVidas = 1;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getEstamina() {
        return estamina;
    }

    private void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    private int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    private void setQuantidadeMoedas(int quantidadeMoedas) {
        this.quantidadeMoedas = quantidadeMoedas;
    }

    private int getQuantidadeVidas() {
        return quantidadeVidas;
    }

    private void setQuantidadeVidas(int quantidadeVidas) {
        this.quantidadeVidas = quantidadeVidas;
    }
}

```

```java
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
```
