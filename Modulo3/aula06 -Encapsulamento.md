


# Aula 06 - Pilares da POO:  Encapsulamento, Herança, Polimorfismo
<img src="../assets/PilaresPOO.jpg" alt="Pilares POO">

## Encapsulamento
#### **Encapsular** é ocultar partes independentes da implementação , permitindo construir partes invisíveis ao mundo exterior.
Encapsular não é obrigatório mas é uma boa prática para produzir Classes mais eficientes.

#### **Interface** é a lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto desta classe.

#

### Vantagens de encapsular: 
#### Tornar mudanças invisíveis
#### Facilitar reutilização de código
#### Reduzir efeitos colaterais 

# 

Assista aos vídeos: 
  1. [Encapsulamento](https://youtu.be/1wYRGFXpVlg?t=46)
  

  1. [Encapsulamento na prática com Java](https://youtu.be/x4JfzV0Wb5w?t=34)


---

## Exercício

Baseado nesta aula e na leitura complementar da [aula 4](../aula04/aula.md). Altere o código do exercío que estamos desenvolvendo desde a [segunda aula](../aula02/resolucao.md) e implemente as seguintes mudanças:

### Nível 1
* Elimine os métodos _getters_ e _setters_.
* Crie um atributo que registra a quantidade de moedas coletadas. Esse atributo deve inicializar com zero.
* Crie um atributo que registra a quantidade de vidas. Esse atributo deve incializar com um.
* Crie um método `revigorar()` que reinicia estamina do Mario em 100.

### Nível 2
* Crie um método `morrer()` que zera a estamina do Mario e desconta uma vida.

### Nivel 3
* Crie um método que para coletar moedas que, a cada acionamento, acrescenta 1 na quantidade de moedas atual.
  * A cada 10 moedas coletadas, o Mario deve ganhar uma vida;

* No método `morrer()`
  * Se o número de vidas for menor que zero após o desconto, a quantidade deve permanecer em zero.
  * Se o número de vidas for maior que um, a estamina deve revigorar após o desconto.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e teste sua implementação.

```java

//Classe
package aula06;

public class Mario {
    //Atributos
    private String nome;
    private double altura;
    private int idade;
    private int estamina;
    private int quantidadeMoedas;
    private int quantidadeVidas;

    //Métodos personalizados
    public void status() {
        System.out.println("Sobre este Mário");
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

    //Métodos especiais
    public Mario() {
        this.nome = "Mario Original";
        this.altura = 1.5;
        this.idade = 40;
        this.estamina = 100;
        this.quantidadeMoedas = 0;
        this.quantidadeVidas = 1;
    }
    public Mario(String nome, int idade, double altura) {
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
//Objetos
package aula06;

public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario();
        mario1.perdeEstamina(10);
        mario1.ganhaEstamina(5);
        mario1.revigorar();
        mario1.coletarMoedas();
        mario1.morrer();

        Mario mario2 = new Mario("Ruanito",35,1.5);
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.perdeEstamina(10);
        mario2.ganhaEstamina(20);
        mario2.crescer();


        mario1.status();
        mario2.status();
    }
}
```

_