package aula09;

import java.util.Scanner;

public class Exercicio3Aula09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º valor:");
        double valor = sc.nextDouble();

        double valorMaior = valor;

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o "+(i+1)+"º valor:");
            valor = sc.nextDouble();
            if (valor > valorMaior) {
                valorMaior = valor;
            }
        }

        System.out.println("O maior valor é: " + valorMaior);

        sc.close(); //Encerra o programa
    }
}
