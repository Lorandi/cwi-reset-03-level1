# Aula 09

## Juntando tudo

Este [vídeo](https://www.youtube.com/watch?v=aWv871ExPqY) do canal [Programador BR](https://www.youtube.com/channel/UCrdgeUeCll2QKmqmihIgKBQ) ajuda a esclarecer.

### **Exercícios:**

Uma empresa quer verificar se um colaborador está qualificado para a aposentadoria. Para estar em condições de se aposentar, ele deve atender a pelo menos um dos seguintes critérios:

- Ter pelo menos 65 anos de idade;
- Ter trabalhado no mínimo 30 anos;
- Ter pelo menos 60 anos de idade e 25 anos de trabalho.

Você deve criar uma função chamada `verificarAposentadoria`, que recebe um `nome` como argumento e verifica se aquele colaborador pode se aposentar.

A função deve imprimir uma mensagem dizendo `"Parabéns, já pode sair de férias eternas :)"` ou `"Infelizmente para você, ainda falta um tempo :("`. Caso seja informado o nome de um colaborador que não existe, deve ser apresentada a mensagem `"Colaborador inválido :|"`.

Use os arrays abaixo para considerar as informações de colaboradores, idade e tempo de trabalho:

```javascript
colaboradores  = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
idades = [69, 66, 58,61, 60, 64, 59, 55]
temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26,29]

function verificarAposentadoria(nome){
  for (let i = 0; i < colaboradores.length; i++){
    if(nome === colaboradores[i]){
        if (idades[i]>= 65 || temposDeTrabalho[i]>=30 || (idades[i]>= 60 && temposDeTrabalho[i] >= 25)){
          return console.log("Parabéns, já pode sair de férias eternas :)" )
        }else{
          return console.log("Infelizmente para você, ainda falta um tempo :(" )
        }      
    }    
  }
  return console.log("Colaborador inválido :|")
}


```

Com a função criada, execute todo código abaixo e verifique se os resultados são os esperados _(o resultado esperado de cada execução está no comentário ao lado da chamada)_:

```javascript
verificarAposentadoria("Rosiméri"); // true (regra 3)
verificarAposentadoria("Agripino"); // false (falta 1 ano de idade para regra 3)
verificarAposentadoria("Rhoger"); // true (todas)
verificarAposentadoria("Hudnélson"); // false (colaborador inexistente)
verificarAposentadoria("Gleysberto"); // true (regra 2)
verificarAposentadoria("Regislane"); // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria("Cléverson"); // true (regras 1 e 3)
verificarAposentadoria("Nádio"); // true (regra 3)
verificarAposentadoria("Wellison"); // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria("Florisberto"); // false (colaborador inexistente)
```
