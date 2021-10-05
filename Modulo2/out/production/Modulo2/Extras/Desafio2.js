/*
Neste desafio o objetivo é imprimir no console os valores do array que cumpram as seguintes condições:
 - Caso o primeiro número do arrray seja par, retornar os outros pares que são múltiplos deste.
Exemplo: array1 = 4, 6, 8, 10, 12, 14 deve retornar 8,12

 - Caso o primeiro número do array seja impar, retornar os outros ímpares que são múltiplos deste.
Exemplo: array2 = 3, 5, 6, 9, 12, 13, 15 deve retornar 9,15

Teste com os seguintes arrays: 
array1 = 4, 6, 8, 10, 12, 14
array2 = 3, 5, 6, 9, 12, 13, 15
array3 = 7, 14, 21, 25, 28, 35, 37, 39, 42
array4 = 6, 8, 18, 23, 28, 30
array5 = 5, 10, 20, 30, 45, 50 
*/


function imprimirMultiplos(array){
  var newArray = []
  if(array[0] % 2 == 0){
    for(let i = 1; i < array.length; i++){
      if(array[i] % 2 == 0 && array[i] % array[0] == 0){
        newArray.push(array[i])
      }
    }
  }else{
    for(let i = 1; i < array.length; i++){
      if(array[i] % 2 == 1 && array[i] % array[0] == 0){
        newArray.push(array[i])
      }
    }
  } return console.log(newArray)
}
imprimirMultiplos([4, 6, 8, 10, 12, 14])
imprimirMultiplos([3, 5, 6, 9, 12, 13, 15])
imprimirMultiplos([7, 14, 21, 25, 28, 35, 37, 39, 42])
imprimirMultiplos([6, 8, 18, 23, 28, 30])
imprimirMultiplos([5, 10, 20, 30, 45, 50])



 




