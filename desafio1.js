function solucao(s) {
  let contribuicaoINSSMensal = 0;
  let contribuicaoINSSAnual = 0;
  let quantidadePessoasNecessarias = 0;
  
  if (s <= 1045.00){
      contribuicaoINSSMensal = s * 0.075;
      } else if (s <= 2089.60){
      contribuicaoINSSMensal = s * 0.09;
      } else if( s <= 3134.40){
      contribuicaoINSSMensal = s * 0.12;
      } else if( s <= 6101.06){
              contribuicaoINSSMensal = s * 0.14;
      } else{
      contribuicaoINSSMensal = 6101.06 * 0.14;
     } 

     contribuicaoINSSAnual = contribuicaoINSSMensal * 13.3;
     quantidadePessoasNecessarias = s / contribuicaoINSSMensal;
  
  return [contribuicaoINSSMensal, contribuicaoINSSAnual, quantidadePessoasNecessarias];
}

console.log(solucao(1045.00))
console.log(solucao(1045.01))
console.log(solucao(2089.60))
console.log(solucao(2089.61))
console.log(solucao(3134.40))
console.log(solucao(3134.41))
console.log(solucao(6101.06))
console.log(solucao(26101.07))

