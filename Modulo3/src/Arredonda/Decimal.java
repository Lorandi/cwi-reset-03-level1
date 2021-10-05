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

