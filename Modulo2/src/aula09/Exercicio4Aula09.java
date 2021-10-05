package aula09;

import java.util.Scanner;

public class Exercicio4Aula09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            valor = sc.nextInt();

        } while (valor < 1 || valor > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (i * valor));
        }
    }
}

