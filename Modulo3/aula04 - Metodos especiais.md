# Aula 04 - Métodos Especiais

Assista aos vídeos: 

  1. [Métodos Especiais](https://youtu.be/g2x9oyBFSco?t=51)
  - Métodos acessores, ou getters, conseguem acessar um determinado atributo mantendo a segurança de acesso a ele. 
  - Métodos modificadores, ou setters, modificam atributos que estão dentro dos objetos.
  - Métodos construtores, ou constructor, são basicamente funções de inicialização de uma classe, as quais são invocadas no momento em que objetos desta classe são criadas. Eles permitem inicializar campos internos da classe e alocar recursos que um objeto da classe possa demandar.
  2. [Métodos Getter, Setter e Construtor](https://youtu.be/6i-_R5cAcEc?t=34)
### Classe
```java
  public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: "+ getModelo() );
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
```
### Objeto
```java
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
        c1.status();
    }
}
```



---

## Material Complementar

Leia [neste artigo](https://blog.caelum.com.br/nao-aprender-oo-getters-e-setters/amp/) uma reflexão interessante sobre utilizar _getters_ e _setters_ de forma consciente.

---
## Exercício

Altere o código do exercío que estamos desenvolvendo desde a [segunda aula](../aula02/resolucao.md) e implemente as seguintes mudanças:

* Crie um novo atributo chamado `estamina` do tipo `int`.
* Todos os atributos devem ser privados.
* Crie métodos _getters_  e _setters_ para todos os atributos.
* Crie um método contrutor padrão, incializa o `nome` como valor "Mario Bros", a `idade` com `40`, a `estamina` com `100` e a `altura` com `1.50`.
* Crie um método contrutor que recebe o `nome`, a `idade` e a `altura` do Mario. Os demais atributos devem ser inicializados como descrito no contrutor padrão.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e teste sua implementação.

### Classe
```java
public class Mario {
    private String nome;
    private String roupa;
    private String cabelo;

    protected double xp;

    private boolean evoluido;

    private int  estamina;
    private double altura;
    private double idade;

    public Mario(String nome, String roupa, String cabelo){
        this.nome = nome;
        this.roupa = roupa;
        this.cabelo = cabelo;

        this.xp = 30;

        this.evoluido = false;

        this.estamina = 100;
        this.altura = 1.5;
        this.idade = 40;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getRoupa() {
        return roupa;
    }

    private void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    private String getCabelo() {
        return cabelo;
    }

    private void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
        if(xp > 40){
            this.evoluido = true;
        }
    }

    public boolean isEvoluido() {
        return evoluido;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public void status(){
        System.out.println("Sobre este Mário");
        System.out.println("Nome: "+ getNome() );
        System.out.println("Roupa: " + getRoupa());
        System.out.println("Cabelo: " + getCabelo());
        System.out.println("Xp: " + this.xp);
        System.out.println("Evoluido: " + isEvoluido());
        System.out.println("Estamina: " + getEstamina());
        System.out.println("Altura: "+ altura);
        System.out.println("Idade: " + getIdade());
        System.out.println("");
    }
}
```

### Objeto
```java
public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario("Moah", "Azul","Preto");
        mario1.status();

        Mario mario2 = new Mario("Ruanito", "Verde","Caspado");
        mario2.setXp(45);
        mario2.setAltura(2);
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.setEstamina(200);
        mario2.status();
    }
}
```
### Resultado
```
Sobre este Mário
Nome: Moah
Roupa: Azul
Cabelo: Preto
Xp: 30.0
Evoluido: false
Estamina: 100
Altura: 1.5
Idade: 40.0

Sobre este Mário
Nome: Ruanito
Roupa: vermelha
Cabelo: Caspado
Xp: 45.0
Evoluido: true
Estamina: 200
Altura: 2.0
Idade: 40.0
```

