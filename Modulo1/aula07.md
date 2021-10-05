# Aula 07 
## Arrays
Este [vídeo](https://www.youtube.com/watch?v=Q8iceY8qCpo) do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

Um array é uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos possa ser identificado por, pelo menos, um índice ou uma chave. Essa estrutura de dados também é conhecida como variável indexada, vetor (para arrays unidimensionais) e matriz (para arrays bidimensionais).

### Criando um array
Um array pode ser composto por strings, números, objetos e atá outros arrays.
```javascript
var brinquedos = ["bola", "pião", "carrinho", "boneca"]
var notas = [4.8, 3.7, 5.6]
var profissionais = [ ["João","pintor"], ["Camila", "escritora"], ["Julio", "motorista"]]
```
E o valor de cada elemento do array pode ser acessado pelo seu índice, lembrando que a contagem sempre começa em 0
```javascript
console.log(brinquedos[0]) //bola
console.log(notas[2]) //5.6
console.log(`A profissional ${profissionais[1][0]} é ${profissionais[1][1]}` )
//A profissional Camila é escritora
```
Variáveis também podem ser colocadas no array utilizando o índice.
```javascript
brinquedos[4] = "pipa"
console.log(brinquedos) // ["bola", "pião", "carrinho", "boneca", "pipa"] 
```

E para saber o tamanho de um array basta chamar a propriedade length
```javascript
console.log(brinquedos.length) //5
```

Para saber mais sobre criação e manipulação de arrays, visite [developer.mozilla.org](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array) e [JavaScript Arrays](https://www.devmedia.com.br/javascript-arrays/4079)


