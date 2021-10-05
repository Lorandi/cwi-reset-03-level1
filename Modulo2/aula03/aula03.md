# Aula 03 - Passando argumentos para o programa

Assista aos vídeos: 

  1. [Passando argumentos para o programa](https://www.youtube.com/embed/dhGPGv7XCM8?start=16&end=562)

```java
  class Argumentos {
  public static void main(String[] args){
    System.out.println("Você digitou " + args[0]);
  }  
}
```

---

## **Exercício:**

- Crie um arquivo chamado aula04.AlunoResetComParametro.java
- Implemente um programa que imprima na tela o texto "Sou aluno do Level 1 do CWI Reset! Me chamo {SEU NOME}"
- Compile e execute o programa

```java
  class aula04.AlunoResetComParametro {
  public static void main(String[] args){
    System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + args[0]);
  }  
}
```
Linha de comando após compiltar ```java aula04.AlunoResetComParametro Rodrigo //Sou aluno do Level 1 do CWI Reset! Me chamo Rodrigo```


_**Após** fazer o exercício, dá uma conferida na [nossa solução](resolucao.md)._ 

---

#### _Material complementar:_

* [Entendendo os Erros](https://youtu.be/NoEoOaTSFMo) 

---
