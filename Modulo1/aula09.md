# Aula 09 
## Funções, procedimentos e comentários
Este [vídeo](https://www.youtube.com/watch?v=2g2bfD6q5NQ) do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

Funções são blocos de construção fundamentais em JavaScript. Uma função é um procedimento de JavaScript - um conjunto de instruções que executa uma tarefa ou calcula um valor. Para usar uma função, você deve defini-la em algum lugar no escopo do qual você quiser chamá-la. Assim a função primeiro precisa ser criada e depois chamada. [veja mais](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Functions)

```javascript
function square(num){ //neste ponto a função é criada
  var num = 5
  return num * num // o retorno deste exemplo será o valor 25
}
square() //neste ponto a função é chamada
```

Uma função também pode receber parametros dentro dos ():
```javascript
function multiplicar(a,b){
  return a * b
}
multiplicar(4,5) //aqui os valores dos parâmentros estão sendo passados
                 //o retorno da função será o valor 20
```
#
### **Exercícios:**

1. Crie uma função chamada `imprimir` que recebe um argumento e simplesmente imprime ele na tela;
```javascript
function imprimir(arg){
  return arg
}
imprimir("Olá mundo")
```
2. Lembra dos exercícios que propusemos na [Aula 05 - Variáveis](../aula05/aula.md#exercícios)? Com base neles, faça o seguinte:
   * Crie uma função para cada algoritmo proposto lá, exceto o número `6`;

```javascript
   var nomeDoFulano = "João"
   var nomeDoBeltrano = "Pedro"
   function mesmoNome(nome1,nome2){
     return nome1 === nome2
   }
   //retorna true ou false  
```

```javascript   
  function maiorDeIdade(idade){
    return idade>=18
  }
  //retorna true ou false
  ```

```javascript
  function valorComJuros(valor,juros){
    return valor +(valor * 0.1)
  }
  valorComJuros(100) //110
```

```javascript
function mediaAritmetica(array){
  var somaElementos = array.reduce((accumulator, currentValue) => accumulator + currentValue) //metodo reduce e arrow function

  return somaElementos/array.length 
}
var array = [1,2,3,4,5]

mediaAritmetica(array) //3
```
   - [método reduce](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce) e [arrow function](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions/Arrow_functions)

```javascript{
function margemBruta(receitaLiquidaVendas,custoProdutosVendidos){
  var lucroBruto = receitaLiquidaVendas - custoProdutosVendidos;
  return (lucroBruto/receitaLiquidaVendas)*100
}
margemBruta(100,90)
```

   * Todas as funções devem _retornar_ o valor final;
   * Procure dar nomes que façam sentido às funções. _Ex.: a função para o item `4` poderia se chamar `mediaAritmetica` ou `calcularMediaAritmetica`_;
   * Procure utilizar comentários para documentar cada método;
   * Na função da média aritmética, evite colocar todos os itens como argumentos do método, pois isso limitaria sua utilização a um número fixo de elementos. Tente implementar uma lógica para receber um array e calcular a média em cima dele, tornando a função mais reaproveitável em diferentes situações.
3. Com as funções criadas, execute todo código abaixo e verifique se os resultados são os esperados _(o resultado esperado de cada função está no comentário ao lado da chamada)_:

```javascript
cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false

imprimir("---")

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]
```