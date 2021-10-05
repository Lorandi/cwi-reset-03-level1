# Aula 10 - Arrays/Vetores

Assista aos vídeos: 

  1. [Arrays/Vetores](https://www.youtube.com/embed/HxRb5KLofcI?start=27&end=1062)
  1. [Loop for each](https://www.youtube.com/embed/2ndBbnsqBXQ?start=7&end=701)

> É **#fundamental** que você assista ao vídeo. É **#opcional** _(embora bem interessante)_ que você faça o exercício.

---

#### _Exercícios:_

1. Crie um programa que receba 5 valores e armazene em um vetor. Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2. Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.
```java
import java.util.Scanner;

public class Exercicio1Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] primeiroArray = new double[5];
        double[] segundoArray = new double[primeiroArray.length];       

        for (int i = 0; i < primeiroArray.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");           
            primeiroArray[i] = sc.nextDouble();
            segundoArray[i] = primeiroArray[i] * 2;
        }

        System.out.println("Primeiro arrayr");
        for(double valores : primeiroArray){
            System.out.println(valores);
        }

        System.out.println("Segundo array");
        for(double valores : segundoArray){
            System.out.println(valores);
        }        
    }
}
```

1. Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor. Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos. Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.

```java
public class Exercicio2Aula10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayIdades = new int[10];
        int maioresDeIdade = 0;

        for (int i = 0; i < arrayIdades.length; i++){
            System.out.println("Digite a " + (i + 1) + "º idade");
            arrayIdades[i] = scan.nextInt();
            if(arrayIdades[i]>=18){
                maioresDeIdade++;
            }
        }
        for(int idade : arrayIdades){
            System.out.println(idade);
        }
        System.out.println("Maiores de 18: " + maioresDeIdade);
    }
}
```



---

#### _Material complementar:_

* [Trabalhando com arrays em Java](https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530)

---

