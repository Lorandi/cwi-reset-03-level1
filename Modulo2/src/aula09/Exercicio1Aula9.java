package aula09;

import java.util.Scanner;

public class Exercicio1Aula9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10:");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10) { // fica pedindo para digitar
            System.out.println("Você digitou: "+ nota + " e deveria digitar uma nota de 0 a 10:");
            nota = sc.nextInt();
        }
        System.out.println("Nota: " + nota);
        sc.close(); //Encerra o programa
    }
}
