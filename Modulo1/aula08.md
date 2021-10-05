# Aula 08 
## Estrutura de repetição
Este [vídeo](https://www.youtube.com/watch?v=FhuqrLaeN34) do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

Estruturas de repetição ou laços oferecem uma forma fácil e rápida de executar uma ação muitas vezes

Existem várias formas diferentes de laços, mas eles essencialmente fazem a mesma coisa: repetir uma ação múltiplas vezes ( inclusive você poderá repetir 0 vezes). Os vários mecanismos diferentes de laços oferecem diferentes formas de determinar quando este irá começar ou terminar. Há várias situações em que é mais fácil resolver um problema utilizando um determinado tipo de laço do que outros.

### Laço For
Um laço `for` é repetido até que a condição especificada seja falsa. Uma declaração for é feita da seguinte maneira:

```javascript
for (let i = 0 ; i < 3 ; i++) {
  console.log(i)
}
// 0
// 1
// 2 
```
O `let i = 0` é a condição inicial, criando a variável `i` com valor `0`. O `i < 3` significa que esse laço deve ser executado enquanto o `i` for menor que zero. Neste caso ele deve ser executado 3 vezes. O `i++` significa que a cada vez que esse laço for executado, o `i`terá o incremento de 1, passando para os valores 1, 2, 3 (e neste momento saindo do laço antes de continuar a execução). 

### Laço While
Uma declaração `while` executa suas instruções, desde que uma condição especificada seja avaliada como verdadeira.

```javascript
var x = 2
while (x < 5){ //condição
  console.log(x) //imprime resultado
  x +=1 //incrementa a variável
}
```
Importante salientar que caso a condição de saída do laço não seja satisfeira, esse pode entrar em um loop infinito. Por isso no exemplo acima foi feito o incremento de `1` à variável `x` a cada execução do laço. 

Exemplo de um loop infinito.
```javascript
while (1 ==1 ){ 
  console.log("loop infinito")
}
```

### Laço Do...While
Muito parecido com o `while` o `Do...while` vai ser executado pelo menos uma vez antes de verificar a condição. Assim, mesmo que a condição não seja atendida, esse laço terá sido executado pelo menos uma vez. Se a condição for verdadeira, ela será novamente executada enquanto a condição se mantiver verdadeira.
```javascript
do {
  i += 1;
  console.log(i);
} while (i < 5);
// resultado será contagem de 1 até 5 pois laço é executado 5 vezes
```
Exemplo de quando o laço é executado apenas uma vez.
```javascript
do {
  i += 1;
  console.log(i);
} while (5 < 4); //condição falsa pois 5 nunca é menor que 4
// resultado  1  
```

### **Exercícios:**

Lembre-se que, para obter o tamanho de um array, é usada a expressão `nomeDoArray.length`. Ex.: 
```javascript
timesDeFutebol = ["Grêmio", "Inter", "Corinthians", "Flamengo"]

quantidadeDeTimes = timesDeFutebol.length

console.log(quantidadeDeTimes)
```

1. Crie um array de `5` posições com quaisquer valores. Utilize qualquer estrutura de repetição apresentada no vídeo para exibir todos os valores do array;
```javascript
var frutas = ["banana", "maçã", "pera", "uva", "mamão"]
for(let i = 0; i < frutas.length; i++){
  console.log(frutas[i])
}
```

2. Crie um algoritmo capaz de calcular a média aritmética de um array com qualquer quantidade de elementos numéricos. Para fins de exemplo, o resultado do algoritmo com um array de valores `1, 2, 3, 5, 8, 13, 21, 23, 34, 55` deve ser `16.5`. Procure usar uma estrutura de repetição diferente da que você usou para fazer o exercício anterior;
```javascript
var num = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
var i = 0;
var somaNum = 0;
while(i < num.length) {
  somaNum += num[i];
  i++;
}
console.log(somaNum/num.length);
```

3. Considerando a [lista dos 60 nomes mais comuns no Brasil nos últimos 10 anos](https://www.revistabula.com/25866-os-60-nomes-mais-populares-no-brasil-nos-ultimos-10-anos-e-seus-significados/), crie um algoritmo para verificar se seu nome está lá. Se sim, exiba a mensagem: `É, nome comum :P`. Se não, exiba a mensagem: `Diferentão, hein? XD`.
```javascript
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

var meuNome = "Rodrigo"

var nomeComum = false;

for(let i = 0; i < nomesComuns.length; i++){
  if(nomesComuns[i] === meuNome){
    nomeComum = true;    
  }  
}

if(nomeComum){
  console.log("É, nome comum :P")
} else{
  ("Diferentão, hein? XD")
}
```
