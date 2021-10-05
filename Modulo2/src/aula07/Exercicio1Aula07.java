package aula07;

import java.util.Scanner;

public class Exercicio1Aula07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = num.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = num.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;

        System.out.printf("Soma: %.2f %n", soma);
        System.out.printf("Subtracao: %.2f %n", subtracao);
        System.out.printf("Multiplicacao: %.2f %n", multiplicacao);
        System.out.printf("Divisao: %.2f %n", divisao);
        System.out.printf("Modulo: %.2f %n" , modulo);
    }
}
