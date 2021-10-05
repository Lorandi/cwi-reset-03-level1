# Aula 03 - O que é Visibilidade em um Objeto?

Assista aos vídeos: 

  1. [O que é Visibilidade em um Objeto?](https://youtu.be/jFI-qqitzwk?t=49)
  #### **Modificadores de uma classe**
  Indicam o nivel de acesso aos componentes internos de uma classe:
  - `+` público - a classe atual e todas as outras classes terão acesso à ela.
  - `-` privado - somente a classe atual.
  - `#` protegido - a classe atual e todas as suas sub classes.
  1. [Configurando Visibilidade de Atributos e Métodos](https://youtu.be/LV2243j4RTQ?t=33)

> É **#fundamental** que você assista ao vídeo. É **#opcional** _(embora bem interessante)_ que você faça o exercício.

---

## Exercício

Altere o código do exercío feito na [aula anterior](../aula02/resolucao.md) para que alguns atributos do Mario sejam públicos, outros como protected e outros como privados.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e teste sua implementação.

Classe
```java
public class Mario {
    public String nome;
    public String roupa;
    public String cabelo;

    protected double xp;

    private boolean evoluido = false;

    private double salto = 5;
    private double altura = 20;
    private double velocidade = 10 ;


    void status(){
        System.out.println("Mario foi criado");
        System.out.println("Nome:  " + this.nome);
        System.out.println("Roupa: " + this.roupa);
        System.out.println("Cabelo: " + this.cabelo);
        System.out.println("Xp: " + this.xp);

    }
   void poderes(){
        if (xp > 50){
            evoluido = true;
        }

        if(evoluido){
            salto = salto + salto * (xp/50);
            altura = altura + altura * (xp / 50);
            velocidade = velocidade + velocidade * (xp / 50);
        }else{
            salto = salto + salto * (xp / 100);
            altura = altura + altura * (xp / 100);
            velocidade = velocidade + velocidade * (xp / 100);
        }
       System.out.println("Evoluido: " + this.evoluido);
       System.out.println("Salto: " + this.salto);
       System.out.println("Altura: " + this.altura);
       System.out.println("Velocidade: " + this.velocidade);
   }
}
```

Objetos
```java
public class SetNewMario {
    public static void main(String[] args) {
        Mario m1 = new Mario();
        m1.nome = "Mario Básico";
        m1.roupa = "Azul";
        m1.cabelo = "Longo e preto";
        m1.xp = 23;
        m1.status();
        m1.poderes();

        System.out.println("");
        Mario m2 = new Mario();
        m2.nome = "Mario Top";
        m2.roupa = "Vermelha";
        m2.cabelo = "Careca";
        m2.xp = 79;
        m2.status();
        m2.poderes();
    }
}
```