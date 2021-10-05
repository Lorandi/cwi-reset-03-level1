package Arredonda;

public class MathRound {
        public static void main(String[] args) {

            double valor = 1234.5678;

            System.out.println("valor : " + valor);

            double ValorDuasCasas = Math.round(valor * 100) / 100.0;
            double ValorTresCasas = Math.round(valor * 1000) / 1000.0;

            System.out.println("Valor com duas casas decimais : " + ValorDuasCasas);
            System.out.println("Valor com três casas decimais  : " + ValorTresCasas);

        }
}
