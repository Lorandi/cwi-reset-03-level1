# Aula 01 
## Introdução à lógica de programação
Este [vídeo ](https://www.youtube.com/watch?v=HXddFUe6VPU)do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

O computador é muito bom e duas coisas: executar taferas muito rápido e armazenar uma grande quantidade de dados. Mas diferente de um ser humano ele não tem experiência prévia, ou seja, cada vez que inicia um novo software, é como se iniciasse do zero.

**O computador não faz o que precisa ser feito. Ele faz aquilo que foi programado para fazer.**

```javascript

se (hora >= 06:00){
    levantar()
    levantou = true
} senão {
    continuarDeitado()
    levantou = false
}

se (levantou == true){
  arrumarACama()

  caminharAteACozinha()

  (fazerCafeDaManha(){
    pegarCaneca()
    se(leite == true){
      botarLeiteNaCaneca()
      canecaComLiquido = true
      
      
    } também se (cafe == true){
      botarCafeNaCaneca()
      canecaComLiquido = true      
      
    }senão{
      largarCaneca()
    }

    se (canecaComLiquido == true){
      aquecerBebidaNoMicroondas()        
      enquanto (bebidaAquecendo = true){
        espere()
      } 
      bebidaPronta = true;       
    } senão{
      console.log("Hoje não tem bebida")
    }

    se (pao >= 1){
      pegarPao()
      levarPaoParaMesa()
    } senão{
      console.log("Hoje não tem pão")
    }
  })() 
  
  se (canecaComLiquido == true || pao >= 1 ){
      tomarCafeDaManha()
  } senão { 
    console.log("Hoje não tem café da manhã")
  }
  (...)  
}
```