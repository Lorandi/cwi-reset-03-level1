# Aula 06 - Lendo dados do teclado usando a classe Scanner

Assista aos vídeos: 

  1. [Lendo dados do teclado usando a classe Scanner](https://www.youtube.com/embed/Z6Y8zupCKfk?start=53&end=1292)

```java

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
     
        System.out.println("Digite seu nome, idade, altura e se é casado: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean casado = scan.hasNextBoolean();
        System.out.println("Nome: " + nome + " idade: " + idade + " altura: " + altura + " casado: " + casado);
    }
}
  ```

  ### Como são invocados alguns métodos
```java
Scanner sc = new Scanner(System.in);

float numF = sc.nextFloat();
int num1 = sc.nextInt();
byte byte1 = sc.nextByte();
long lg1 = sc.nextLong();
boolean b1 = sc.nextBoolean();
double num2 = sc.nextDouble();
String nome = sc.nextLine(); //toda a frase
String nome = sc.next(); //apenas a primeira palavra
```



---

### **Exercício:**

- Vamos refazer o exercício da aula 3 usando a classe Scanner:
  - Crie um arquivo chamado AlunoResetLeituraTeclado.java
  - Implemente um programa que solicite para o usuário digitar o próprio nome. Ao final imprima na tela o texto "Sou aluno do Level 1 do CWI Reset! Me chamo {SEU NOME}"
  - Compile e execute o programa manualmente ou utilize a IDE para facilitar

```java
import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.next();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo: " + nome);
    }
}
```


---
#### _Material complementar:_

* [Como funciona a classe Scanner do Java?](https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448)

---
