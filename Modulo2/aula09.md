# Aula 09 - Loops

Assista aos vídeos: 

  1. [Loops while e do-while](https://www.youtube.com/embed/9_12LPVMJYc?start=42&end=732)
  1. [Loop for](https://www.youtube.com/embed/HrfWrbmFUKQ?start=24&end=1089)
  1. [Comandos Break e Continue](https://www.youtube.com/embed/rU-DCmwAtXE?start=28&end=1122)


---

### **Exercícios:**

1. Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez, mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido. Quando o usuário informar uma nota válida, imprima o valor da nota. 

```java
import java.util.Scanner;

public class Exercicio1Aula9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10:");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10) { // fica pedindo para digitar
            System.out.println("Você digitou: "+ nota + " e deveria digitar uma nota de 0 a 10:");
            nota = sc.nextInt();
        }
        System.out.println("Nota: " + nota);
        sc.close(); //Encerra o programa
    }
}
```
1. Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número até que o segundo número seja maior que o primeiro.

```java
import java.util.Scanner;

public class Exercicio2Aula9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite outro valor:");
        int valor2 = sc.nextInt();

        while(valor1 >= valor2){
            System.out.println("O segundo valor deve ser maior que o primeiro, digite novamente: ");
            valor2 = sc.nextInt();
        }

        for(int i = ++valor1; i < valor2; i++){
            System.out.println(i);
        }

        sc.close(); //Encerra o programa
    }
}
```


1. Faça um programa que leia 5 números e informe o maior número.
```java
public class Exercicio3Aula09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º valor:");
        double valor = sc.nextDouble();

        double valorMaior = valor;

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o "+(i+1)+"º valor:");
            valor = sc.nextDouble();
            if (valor > valorMaior) {
                valorMaior = valor;
            }
        }

        System.out.println("O maior valor é: " + valorMaior);

        sc.close(); //Encerra o programa
    }
}
```
1. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: 
    ```
    Tabuada do 5: 

    5 x 1 = 5 
    5 x 2 = 10
    .
    .
    .
    5 x 10 = 50
    ```
```java
public class Exercicio4Aula09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            valor = sc.nextInt();
        }while(valor < 1 || valor > 10 );

        for(int i = 1; i <= 10; i++){
            System.out.println( valor + " x " + i + " = " + (i*valor));
        }
    }
}
```
---

#### _Material complementar:_

* [Estruturas condicionais e estruturas de repetição em Java](https://www.treinaweb.com.br/blog/estruturas-condicionais-e-estruturas-de-repeticao-em-java)
* [Estruturas de Repetição](https://tableless.com.br/java-estruturas-de-repeticao/)

---
