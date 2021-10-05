package aula07;

import java.util.Scanner;

public class Exercicio2Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite a primeiro nota: ");
        double num1 = num.nextDouble();

        System.out.println("Digite a segundo nota");
        double num2 = num.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = num.nextDouble();

        System.out.println("Digite a quarta nota");
        double num4 = num.nextDouble();

        double media = (num1 + num2 + num3 + num4)/4;

        System.out.printf("Media: %.2f %n", media);

    }
}

