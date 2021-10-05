package aula10;

import java.util.Scanner;

public class Exercicio1Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] primeiroArray = new double[5];
        double[] segundoArray = new double[primeiroArray.length];

        for (int i = 0; i < primeiroArray.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            primeiroArray[i] = sc.nextDouble();
            segundoArray[i] = primeiroArray[i] * 2;
        }

        System.out.println("Primeiro arrayr");
        for(double valores : primeiroArray){
            System.out.println(valores);
        }

        System.out.println("Segundo array");
        for(double valores : segundoArray){
            System.out.println(valores);
        }
    }
}
