# Aula 10 - Pilares da POO: Polimorfismo

Assista aos vídeos: 

  1. [Polimorfismo - Parte 1](https://youtu.be/9-3-RMEMcq4?t=35)
  1. [Polimorfismo na prática com Java - Parte 1](https://youtu.be/NctjqlfKC0U?t=33)
  1. [Polimorfismo - Parte 2](https://youtu.be/hYek1xqWzgs?t=35)
  1. [Polimorfismo na prática com Java - Parte 2](https://youtu.be/b7xGYh3NHZU?t=34)
#
### Assinatura do método
Quantidades e tipos de parâmetros: 
 ```java
 public metodo void (n1: Real, n2: Inteiro) : Real
 ```
 ```java
 public metodo void (x1: Real, x2: Inteiro) : Inteiro
 ```
  ```java
 public metodo void (x1: Inteiro, x2: Real) : Real
 ```
 ```java
 public metodo void (bim: Inteiro, c1: Real c2: Real) : Real 
 ```
 Mesmo com retornos diferentes, os dois primeiros tem a mesma assinatura pois recebem a mesma quantidade e tipo de parâmetros. Já o terceiro não tem a mesma assinatura pois a ordem é diferente. Já o quarto não tem a mesma assinatura pois recebe mais parâmetros e com tipos diferentes.
Para ter a mesma assinatura, deve ter os mesmos paramentros, com a mesma quantidade, na mesma ordem, não importando o retorno.

 #
 ### Tipos de Polimorfismo
 Existem pelo menos 4 tipos de polimorfismo mas aqui só seá trabalhado 2.
 #### Sobreposição
 Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura. **Mesma assinatura e Classes diferentes**
 #### Sobrecarga
 Métodos com o mesmo nome, com assinaturas diferentes, dentro de uma mesma classe. **Assinaturas diferentes e mesma Classe**. Se tiver o mesmo tipo e quantidade de parametros na mesma ordem, o java não aceita. se estiverem em ordens diferentes, mesmo que sejam as mesmas variáveis, o java aceita. 

---

## Exercício

Visando exercitar os conceitos de polimorfismo por sobrecarga e sobreposição, vamos evoluir o nosso projeto do jogo Mario Bros, aprimorando a classe Personagem que ainda possui alguns comportamentos que não contemplam a estrutura de herança que implmentamos nas aulas anteriores. Para refiná-la, vamos utilizar as ideias do polimorfismo e aplicar as regras nas suas respectivas classes especializadas.

### Sobreposição
* Vamos aprimorar o método de crescer, pois cada personagem cresce para um tamanho diferente.
  * Torne o método `crescer()` abstrato e código a regra de crescimento nas classes especializadas conforme decrito a seguir.
    * Para o Mario, quando ele crescer, sua nova altura é 50% maior que a sua altura atual.
    * Para o Luigi, quando ele crescer, sua nova altura são 75% maior que a sua altura atual.
    * Para o Yoshi, quando ele crescer, sua nova altura é 10% maior que a sua altura atual.
  * Note que para isso você precisará tornar a sua altura acessível para as classes filhas. Lembra dos modificadores de acesso vistos na aula 3? Revise-os caso não lembre, pois precisará aqui.

### Sobrecarga
* Vamos atualizar o comportamento do metodo de saltar. Agora os personagens poderão saltar e saltar sobre obstaculos.
  * Atualize o metodo `saltar()` para que ele imprima uma mensagem de que o personagem está pulando 50% da sua altura.
  * Crie uma sobregcarga do metodo `saltar()` para que ele pule uma altura 50% maior que o altura do objeto a sua frente. A altura do objeto será recebida como parâmetro nesta sobrecarga.

