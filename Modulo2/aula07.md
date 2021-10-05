# Aula 07 - Operadores (Aritiméticos, Lógicos e Relacionais)

Assista aos vídeos: 

  1. [Operadores](https://www.youtube.com/embed/199tKAE6sxo?start=78&end=2030)

  ## Operadores Aritméticos
  | Operador | Função  
  | - | - |
  | + | Adição 
  | - | Subtração 
  | * | Multiplicação 
  | / | Divisão 
  | % | Módulo 
  | ++ | Incremento 
  | -- | Decremento

  ## Operadores de Igualdade
  | Operador | Função
  | - | - |  
  | == | Utilizado quando desejamos verificar se uma variável é igual a outra. |
  | != | Utilizado quando desejamos verificar se uma variável é diferente de outra. |
   

  ## Operadores Relacionais
   | Operador | Função
   | - | - |
  | > | Utilizado quando desejamos verificar se uma variável é maior que outra. 
  | >= | Utilizado quando desejamos verificar se uma variável é maior ou igual a outra |
  | < | Utilizado quando desejamos verificar se uma variável é menor que outra. |
  | <= | Utilizado quando desejamos verificar se uma variável é menor ou igual a outra. |

  ## Operadores Lógicos
  | Operador | Função
  | - | - |
   | & | e |
   | barra vertical | ou | 
   | ^ | XOR -  verdadeiro se e somente se os dois operandos forem diferentes|
   | dupla barra vertical | ou curto circuito | 
   | && | curto circuito |
   | ! | não |

```java
    public class Operadores {
    public static void main(String[] args) {
        System.out.println(true || false); //true
        System.out.println(true && false); //false
        System.out.println(true ^ false); //true
        System.out.println(!true || false); //false
    }
}
``` 
  

---

### **Exercícios:**

1. Faça um programa que tenha como entradas dois números e imprima a soma de ambos. Utilize a classe Scanner para obter as entradas.

```java

import java.util.Scanner;

public class Exercicio1Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = num.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = num.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;

        System.out.printf("Soma: %.2f %n", soma);
        System.out.printf("Subtracao: %.2f %n", subtracao);
        System.out.printf("Multiplicacao: %.2f %n", multiplicacao);
        System.out.printf("Divisao: %.2f %n", divisao);
        System.out.printf("Modulo: %.2f %n" , modulo);
    }
}
```
1. Faça um programa que tenha como entradas 4 notas e imprima a média. Utilize a classe Scanner para obter as entradas.

```java
import java.util.Scanner;

public class Exercicio2Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite a primeiro nota: ");
        double num1 = num.nextDouble();

        System.out.println("Digite a segundo nota");
        double num2 = num.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = num.nextDouble();

        System.out.println("Digite a quarta nota");
        double num4 = num.nextDouble();

        double media = (num1 + num2 + num3 + num4)/4;

        System.out.printf("Media: %.2f %n", media);

    }
}
```

1. Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
```java
import java.util.Scanner;

public class Exercicio3Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Valor por hora: ");
        double num1 = num.nextDouble();

        System.out.println("Horas trabalhadas por mês");
        double num2 = num.nextDouble();

        double salario = (num1 * num2);

        System.out.printf("Salário: %.2f %n", salario);

    }
}
```
---

#### _Material complementar:_

* [Java: operadores de atribuição, aritméticos, relacionais e lógicos](https://www.devmedia.com.br/java-operadores-de-atribuicao-aritmeticos-relacionais-e-logicos/38289)

---
