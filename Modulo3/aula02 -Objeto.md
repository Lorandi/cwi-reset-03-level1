# Aula 02 - O que é um Objeto?

Assista aos vídeos: 

  1. [O que é um Objeto?](https://youtu.be/aR7CKNFECx0?t=48)
  Objeto é algo material ou abstrato que pode ser percebido pelos sentidos e descrita por meio das suas características (atributos), comportamento (método) ou estado atual (estado). Classes são os moldes que são utilizados para gerar esse objeto.


  1. [Criando Classes e Objetos em Java](https://youtu.be/wNaoX6VOj54?t=34)

### Classe: 
Define os atributos e métodos comuns que serão compartilhados por um objeto.
```java
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Criada uma caneta");
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true){
            System.out.println("Erro. Caneta tampada. Não posso rabiscar");
        }else{
            System.out.println("Estou pronta para rabiscar");
        }
    };

    void tampar() {
        this.tampada = true;
        System.out.println("Tampar caneta!");
    };

    void destampar() {
        this.tampada = false;
        System.out.println("Destampar caneta!");
    };
}
```

### Objeto: 
É a instância de uma classe.
```java
public class Canetas {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

        System.out.println(" ");

        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.tampar();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();
    }
}
```
---

## Material Complementar

As imagens abaixo podem ser utilizadas como mapa mental sobre os elementos de um código Java.

### Programa Hello Universe

![programaHelloUniverse.png](programaHelloUniverse.png)

### Instanciando uma classe

![instanciaClasse.png](instanciaClasse.png)

---

## Exercício

![Mario](https://switch-brasil.com/wp-content/uploads/2020/03/Super-Mario-Bros-Scrn30032020.jpg)

### História

Mario é um personagem da franquia e série de jogos eletrônicos Super Mario da Nintendo, criado pelo desenvolvedor e designer de jogos eletrônicos japoneses Shigeru Miyamoto. Servindo como mascote da Nintendo e protagonista da série, Mario já apareceu em mais de 200 jogos desde sua criação.

### Aparência
Mario tem pele clara, é baixo um pouco corpulento. Ele tem olhos azuis brilhantes, nariz grande e um bigode grosso castanho-escuro. Mario tem cabelo castanho curto com duas costeletas, franjas grandes e um topete.

Ele veste uma camisa vermelha e um macacão azul com botões amarelos. Ele usa um boné vermelho com o símbolo "M" em seu nome e usa luvas brancas e sapatos marrons.

### Mais detalhes
Para mais detalhes, leia a fonte dessas informações [aqui](https://mario.fandom.com/wiki/Mario).

### Atividade

Crie uma classe Mario que represente uma abstração do personagem para um código Java. Nesta classe, você deve definir algumas características (atributos) físicas, um comportamento (método) que imprima suas características e um comportamento (método) que imprima alguns dos seus superpoderes.

Por fim, crie outra classe que contenha um método `main()`, instancie um objeto do tipo Mario e execute uma chamada para o método que imprima seus dados e outro que imprima alguns dos seus superpoderes. Execute o código e veja o resultado no _console_ (saída).

### Classe
```java
public class Mario {
    String nome;
    String roupa;
    String cabelo;

    boolean evoluido;

    int salto;
    double altura;
    int velocidade;

    void status(){
        System.out.println("Mario foi criado");
        System.out.println("Nome:  " + this.nome);
        System.out.println("Roupa: " + this.roupa);
        System.out.println("Cabelo: " + this.cabelo);
        System.out.println("Evoluido: " + this.evoluido);
    }
   void poderes(){
        if(evoluido){
            salto = 40;
            altura = 1.5;
            velocidade = 10;
        }else{
            salto = 20;
            altura = 1;
            velocidade = 2;
        }
       System.out.println("Salto: " + this.salto);
       System.out.println("Altura: " + this.altura);
       System.out.println("Velocidade: " + this.velocidade);
   }
}
```

### Objetos
```java
public class SetNewMario {
    public static void main(String[] args) {
        Mario m1 = new Mario();
        m1.nome = "Mario Básico";
        m1.roupa = "Azul";
        m1.cabelo = "Longo e preto";
        m1.evoluido = false;
        m1.status();
        m1.poderes();

        System.out.println("");
        Mario m2 = new Mario();
        m2.nome = "Mario Top";
        m2.roupa = "Vermelha";
        m2.cabelo = "Careca";
        m2.evoluido = true;
        m2.status();
        m2.poderes();
    }
}
```