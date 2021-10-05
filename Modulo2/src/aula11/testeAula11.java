package aula11;

public class testeAula11{
    public static void main(String[] args) {
        int i = 2;

        int j = 4;

        int k = 6;

        i += ++j - k--;

        k *= i++ +  i * j;

        System.out.println(i+k+j);

        i = 2;
        j = 4;
        k = 6;

        j = j + 1;
        i = i + j - k;
        k = k - 1;
        k = k * (i + (i+1) * j);
        i = i + 1;
        System.out.println(i+k+j);
        /*  Feedback
        Para resolver esta questão, precisamos entender a diferença entre usar os operadores ++ e -- antes ou depois da variável.

                Quando usado antes da variável, significa que a variável será incrementada e então usada na expressão já com o novo valor.
                Quando usado depois da variável, significa que a variável será usada na expressão com o seu valor original e somente depois disso é que ela será incrementada com o novo valor.

                Dessa forma, precisamos desmembrar as linhas por partes.

                Considerando a linha:
        i += ++j - k--;

        Observe que a variável "j" está com o operador de incremento antes da variável. Então, quando a expressão for executada, este item já estará incrementado. Para substituir o código, precisaremos primeiro incrementar esta variável:
        j = j + 1;
        A variavel k, possui o operador de decremento após ela. Então não precisamos nos preocupar com isso neste momento. O próximo passo é desfazer o operador +=, que indica que a variável "i" será somada ao resultado da expressão.
        i = i + j - k;
        Agora sim precisamos decrementar o valor de k:
        k = k - 1;

        A próxima linha não possui nenhum operador antes da variável:
        k *= i++ + i * j;
        Então podemos simplesmente substituir o operador *=. O ponto de atenção é que o valor de k será multiplicado pelo resultado de todo o resto da expressão, então precisaremos usar parênteses aqui. Além disso, o valor de i será incrementado após a interpretação do bloco depois do *= mas antes de multiplicar pelo valor de k. Diferente do que ocorreu na primeira linha, pois aqui estamos usando o operador de multiplicação, onde a ordem das operações influencia o resultado final. Então precisaremos replicar este comportamento.
                k = k * (i + (i+1) * j)
        E, por fim, incrementamos o valor de i para que a variável fique atualizada:
        i = i + 1;

        Resultado final:

        j = j + 1;
        i = i + j - k;
        k = k - 1;
        k = k * (i + (i+1) * j);
        i = i + 1; */


    }
}
