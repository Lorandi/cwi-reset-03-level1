function imprimir(arg) {
  return console.log(arg);
}

var nomeDoFulano = "João";
var nomeDoBeltrano = "Pedro";
function mesmoNome(nome1, nome2) {
  return nome1 === nome2;
}

function maiorDeIdade(idade) {
  return idade >= 18;
}

function valorComJuros(valor) {
  return valor + valor * 0.1;
}

function mediaAritmetica(array) {
  var somaElementos = array.reduce(
    (accumulator, currentValue) => accumulator + currentValue );
  return somaElementos / array.length;
}

function margemBruta(receitaLiquidaVendas, custoProdutosVendidos) {
  var lucroBruto = receitaLiquidaVendas - custoProdutosVendidos;
  return (lucroBruto / receitaLiquidaVendas) * 100;
}

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