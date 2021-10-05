# Aula 04 
## O que são variáveis?
Este [vídeo](https://www.youtube.com/watch?v=-ny7Kqm0V68) do canal [Node Studio Treinamentos](https://www.youtube.com/channel/UCZZ0NTtOgsLIT4Skr6GUpAw) ajuda a esclarecer.

**Uma variável é um espaço reservado na memória de um computador para armazenar um tipo de dado determinado.**
#
## Tipos de variáveis
 - Toda variável tem um nome;
 - Uma variável tem/recebe um valor;
 - O símbolo = indica que um valor está sendo atribuído à variável. Para testar se uma variável é igual a outra, deve-se usar ==.

 ### Variáveis númericas
 São valores numéricos positivos ou negativos, podendo ser inteiros ou reais (fracionários)
 ```javascript
 var cadeira = 1 //inteiros - **int**
 var distancia = 3.58 //real, fracionário - **float**
 ```

 ### Variáveis caracteres
 Podem ter qualquer valor(números, letras, caracteres especiais) que são interpretados como texto. São chamados de string e escritos entre 'aspas'.
 ```javascript
 var endereco = "Rua Olivia da Silva Nº852"
 var nome = "Rodrigo Lorandi" 
 ```
 ### Variáveis lógicas
 São variáveis que tem valores `true`(verdadeiro) ou `false`(falso). São chamados de `boolean` ou booleanos.
```javascript
var temSol = true
var vaiChover = false
```

## Exercício:
Repare na variável apresentacao mostrada a seguir. Ela é uma string que representa um texto que pode mudar conforme o valor de outras variáveis.

Identifique e crie todas as variáveis necessárias para que o texto de apresentacao seja exibido sem erros. Depois, crie a variável apresentacao exatamente como mostrado a seguir e a imprima da seguinte forma: console.log(apresentacao).

```javascript
apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + "."
```

Dica: você deve criar as demais variáveis antes de criar a variável apresentacao.
### Resolução
```javascript
var nomeCompleto = "Rodrigo Lorandi"
var apelido = "Disco"
var idade = 41
var dataNascimento = "18/03/1980"
var localNascimento = "Porto Alegre"
var altura = 1.80
var trabalhando = true;

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + "."

console.log(apresentacao)
```