# Aula 08 - Condicionais 

Assista aos vídeos: 

  1. [Condicionais If-Else](https://www.youtube.com/embed/KJYSXTYgL_o?start=47&end=800)
  1. [Condicional Switch-Case](https://www.youtube.com/embed/JTLgFZyBUN4?start=30&end=973)

---

### **Exercícios:**

1. Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final o programa deve apresentar:
    - A mensagem `Aluno aprovado`, se a média alcançada for igual ou superior a sete; 
    - A mensagem `Aluno reprovado`, se a média for inferior a sete; 
    - A mensagem `Aluno aprovado com louvores`, se a média for igual a dez. 
```java
public class Exercio1Aula08 {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 8;
        double nota3 = 9;
        double nota4 = 10;

        double media = (nota1+nota2+nota3+nota4)/4;

        if(media == 10){
            System.out.println("Aluno aprovado com louvores");
        }else if(media >= 7 ){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno Reprovado");
        }
    }
}
```
1. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não corresponda à um dia da semana, então deve imprimir a mensagem `Valor inválido!`. 

```java
public class Exercicio2Aula08 {
    public static void main(String[] args) {
        int diaDaSemana = 6;
        switch (diaDaSemana){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sábado");break;
            default: System.out.println("Valor inválido");
        }
    } System.out.println((diaDaSemana < 1 || diaDaSemana > 7) ? "diaDaSemana deve ser entre 1 e 7": diaDaSemana);
}
```
---
#### _Material complementar:_

* [if/else e o operador ternário](https://www.devmedia.com.br/java-if-else-e-o-operador-ternario/38185)

---
