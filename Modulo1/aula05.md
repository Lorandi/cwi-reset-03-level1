# Aula 05 
## Operadores
Este [vídeo](https://www.youtube.com/watch?v=FDrR18rvvCc) do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

### Operadores de atribuição
Os operadores de atribuição são operadores binários. O operando da esquerda é o nome de uma variável e o operando da direita é um valor literal ou outra variável ou uma expressão.
```javascript
var x = 5           //atribuindo o valor 5 à variável x
var nome = "José"   //atribuindo o valor "José" à variável nome
var y = x           //atribuindo o valor da variável x à variável y
var w = x + y       // atribuindo à w o valor da soma de x + y
x += 3              //variavel x = x + 3 que resulta em 8
y -= 1              //variavel y = y - 1 que resulta em 4
```

### Operadores aritméticos
```javascript
x = 5 + 6   //11
x = 7 - 4   // 3 
x = 5 * 3   //15
x = 10 / 5  //2
x = 13 % 5  //2 Módulo - o resto da divisão de 13 por 5 é 3
 ```

### Operadores relacionais
Operadores relacionais só podem ter como resultado um valor booleano, que pode assumir apenas os valores verdadeiro ou falso.
 - igual: ==
 - diferente: !=
 - maior que: >
 - menor que: <
 - maior ou igual a: >=
 - menor ou igual a: <=

 Veja mais em [DevChannel](https://devschannel.com/logica-de-programacao/operadores)

#
 ## Exercícios:
1) Crie uma variável `mesmoNome` que verifica se `nomeDoFulano` é igual a `nomeDoBeltrano`;
```javascript
var mesmoNome = (nomeDoFulano == nomeDoBeltrano)
```

2) Crie uma variável `maiorDeIdade` que verifica se `idade` é de um adulto;
```javascript
var maiorDeIdade = (idade >= 18)
```

3) Crie uma variável `valorComJuros` que calcula o valor de um boleto acrescido de 10% de juros por atraso;
```javascript
var valorComJuros = (valorDoBoleto * 1.10)
```

4) Faça a representação da fórmula de média aritmética, considerando um conjunto de elementos com 5 elementos nomeados como `item1`, `item2`, `item3`, `item4` e `item5`;
```javascript
var media = (item1 + item2 + item3 + item4 + item5)/5;
```

5) O lucro bruto de uma empresa é representado pela receita líquida de vendas menos o custo dos produtos vendidos. A margem bruta de uma empresa é calculada pela divisão do lucro bruto pela receita líquida de vendas. Faça a representação da fórmula da margem bruta, multiplicando o resultado final por 100 para obter o valor percentual;
```javascript
var lucroBruto = receitaLiquidaVendas - custoProdutosVendidos;
var margemBruta = (lucroBruto/receitaLiquidaVendas)*100
```

6) Usando qualquer ferramenta de codificação, crie um algoritmo seguindo os passos abaixo para encontrar o valor do saldo ao final do processo (atente-se para utilizar . como separador decimal):

 - O saldo da sua conta é R$ 1000,00
```javascript
 var saldo = 1000.00
```
 - Você decide comprar uma calça por R$ 99,90
```javascript
var saldo = 1000.00
 var calca = 99.99
 saldo = saldo - calca
```
 - Você recebe o seu salário de R$ 2500,00
```javascript
var saldo = 1000.00
var calca = 99.99
var salario = 2500.00
saldo = saldo - calca + salario
```
 - Você está caminhando na rua e decide dar R$ 0,10 para um morador de rua
```javascript
var saldo = 1000.00
var calca = 99.99
var salario = 2500.00
var gorjeta = 0.10
saldo = saldo - calca + salario - gorjeta
```
 - Você compra um ar condicionado cujo valor é 25% do seu saldo atual
```javascript
var saldo = 1000.00
var calca = 99.99
var salario = 2500.00
var gorjeta = 0.10
saldo = saldo - calca + salario - gorjeta
var arCondicionado = (saldo * 0.25)
saldo = saldo - arCondicionado;
```
 - Você decide antecipar o pagamento de uma dívida usando metade do seu saldo
 ```javascript
var saldo = 1000.00
var calca = 99.99
var salario = 2500.00
var gorjeta = 0.10
saldo = saldo - calca + salario - gorjeta
var arCondicionado = (saldo * 0.25)
saldo = saldo - arCondicionado
saldo /= 2
```
 - Qual o valor do seu saldo? 🤔
 **R$ 1274.96**
