

function solucao(valorInicial, valorFinal, digito) {
  let newArray = [];
  for (var i = 0; i <= valorFinal - valorInicial;i++){
    newArray.push(valorInicial + i)
  }
  return newArray.indexOf(digito);
}

console.log(solucao(0, 22, 0 ))
console.log(solucao(0, 18, 9 ))
console.log(solucao(1, 100, 6 ))