package aula07;

import java.util.Scanner;

public class Exercicio3Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Valor por hora: ");
        double num1 = num.nextDouble();

        System.out.println("Horas trabalhadas por mês");
        double num2 = num.nextDouble();

        double salario = (num1 * num2);

        System.out.printf("Salário: %.2f %n", salario);

    }
}
