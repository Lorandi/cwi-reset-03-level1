Enquanto no  **Javascript** para fazer com que o número tenha apenas duas casas decimais, basta usar o método .toFixed(2) como já foi discutido nesta [issue](https://github.com/cwi-reset/edicao-03-level-1/issues/30).

```javascript
receitaLiquidaVendas = 87

custoProdutosVendidos = 50

var lucroBruto = receitaLiquidaVendas - custoProdutosVendidos;
var margemBruta = ((lucroBruto/receitaLiquidaVendas)*100).toFixed(2)

console.log("Margem Bruta de Lucro " + margemBruta + " %")
//Margem Bruta de Lucro 42.53 %
```

No **Java**, parece ser um pouco menos prático. Aqui estão duas formas:

### Math Round
```java
public class MathRound {
        public static void main(String[] args) {

            double valor = 1234.5678;

            System.out.println("valor : " + valor);

            double ValorDuasCasas = Math.round(valor * 100) / 100.0;
            double ValorTresCasas = Math.round(valor * 1000) / 1000.0;

            System.out.println("Valor com duas casas decimais : " + ValorDuasCasas); //Valor com duas casas decimais : 1234.57
            System.out.println("Valor com três casas decimais  : " + ValorTresCasas);//Valor com três casas decimais : 1234.568
        }
}
```
### Decimal Format
```java
package Arredonda;

import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Decimal {
    public static DecimalFormat a1 = new DecimalFormat("0.00"); //Dois casas decimais
    public static DecimalFormat a2 = new DecimalFormat("0.000"); //Três casas decimais

    public static void main(String[] args) {

        double valor = 123.45789;

        System.out.println("Valor : " + valor);  //Valor : 123.456789

        // Default é RoundingMode.HALF_EVEN
        System.out.println("Valor : " + a1.format(valor));      //Valor : 123,46
        System.out.println("Valor : " + a2.format(valor));      //Valor : 123,458


        //Arredonda para baixo
        a1.setRoundingMode(RoundingMode.DOWN);
        a2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Valor : " + a1.format(valor));      //Valor : 123,45
        System.out.println("Valor : " + a2.format(valor));      //Valor : 123,457

        //Arredonda para cima
        a1.setRoundingMode(RoundingMode.UP);
        a2.setRoundingMode(RoundingMode.UP);
        System.out.println("Valor : " + a1.format(valor));      //Valor : 123,46
        System.out.println("Valor : " + a2.format(valor));      //123,458
    }
}
```

Há ainda uma terceira forma utilizando [BigDecimal](https://www.devmedia.com.br/java-bigdecimal-trabalhando-com-mais-precisao/30286) mas me pareceu ainda menos prático pois recomenda-se que a variável seja uma String por questão de precisão e as operações aritméticas demandam métodos do próprio BigDecimal. 

Conhece alguma forma diferente?

