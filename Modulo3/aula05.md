# Aula 05 - Exemplo Prático com Objetos

Assista aos vídeos: 

  1. [Exemplo Prático com Objetos](https://youtu.be/ull_DVFFOq0?t=46)
  1. [Exemplo Prático em Java](https://youtu.be/hOC461osYgk?t=35)

```java
  //Classe 
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual() {
        System.out.println(" ");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println(" ");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta do " + this.getDono() + " aberta com sucesso");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if(this.getSaldo()< 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dívida");
        } else{
            this.setStatus(false);
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Não há saldo suficiente para este saque");
            }
        }else{
            System.out.println("Impossível sacar de  uma conta fechada");
        }
    }

    public void pagarMensal() {
        int mensalidade = 0;
        if (this.getTipo() == "CC"){
            mensalidade = 12;
        }else if (this.getTipo() == "CP"){
            mensalidade = 20;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + " no valor de R$" + mensalidade);
        } else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }

    //Métodos especiais


    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

//Objetos

public class Contas {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");


        conta1.depositar(100);
        conta2.depositar(500);

        conta1.sacar(100);
        conta2.sacar(400);

        conta1.sacar(100);
        conta2.sacar(400);

        conta1.pagarMensal();
        conta2.pagarMensal();

        conta1.fecharConta();
        conta2.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();
    }
}
```


---

## Exercício

Altere o código do exercío que estamos desenvolvendo desde a [segunda aula](../aula02/resolucao.md) e implemente as seguintes mudanças:

* Crie um método para perder estamina e desconta 10 pontos do valor atual;
  * Se após o desconto o valor da estamina for negativo, o atributo deve ficar com 0 (zero) e não com um valor negativo.
* Crie um método para perder ganhar e acrescenta 5 pontos do valor atual;
  * Se após o desconto o valor da estamina for maior que 100, o atributo deve ficar com 100 e não com um valor superior.
* Crie um método crescer para simular o efeito de quando ele come um cogumelo. Neste método, sua altura deve ser dobrada.

Os metodo criados neste exercício devem alterar seus respectivos atribuitos e não devem imprimir nada no console. Para ver o resultado, execute o método de impressão das características feito anteriormente.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e teste sua implementação.

```java
//Classe
public class Mario {
    //Atributos
    private String nome;
    private String roupa;
    private String cabelo;

    private int estamina;
    private double altura;
    private double idade;

    //Métodos personalizados
    public void status() {
        System.out.println("Sobre este Mário");
        System.out.println("Nome: " + getNome());
        System.out.println("Roupa: " + getRoupa());
        System.out.println("Cabelo: " + getCabelo());

        System.out.println("Estamina: " + getEstamina());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + getIdade());
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



    //Métodos especiais
    public Mario(String nome, String roupa, String cabelo) {
        this.nome = nome;
        this.roupa = roupa;
        this.cabelo = cabelo;
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
}

// Objetos
public class Marios {
    public static void main(String[] args) {
        Mario mario1 = new Mario("Moah", "Azul","Preto");
        mario1.perdeEstamina(10);
        mario1.ganhaEstamina(5);


        Mario mario2 = new Mario("Ruanito", "Verde","Raspado");
        //mario2.setRoupa("vermelha"); não pode mudar por ser private
        mario2.setEstamina(200);
        mario2.perdeEstamina(10);
        mario2.ganhaEstamina(20);
        mario2.crescer();


        mario1.status();
        mario2.status();
    }
}
```
//Resultados
```Sobre este Mário
Nome: Moah
Roupa: Azul
Cabelo: Preto
Estamina: 95
Altura: 1.5
Idade: 40.0

Sobre este Mário
Nome: Ruanito
Roupa: Verde
Cabelo: Raspado
Estamina: 100
Altura: 3.0
Idade: 40.0
```

