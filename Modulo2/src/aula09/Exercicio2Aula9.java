package aula09;

import java.util.Scanner;

public class Exercicio2Aula9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite outro valor:");
        int valor2 = sc.nextInt();

        while(valor1 >= valor2){
            System.out.println("O segundo valor deve ser maior que o primeiro, digite novamente: ");
            valor2 = sc.nextInt();
        }

        for(int i = ++valor1; i < valor2; i++){
            System.out.println(i);
        }



        sc.close(); //Encerra o programa
    }
}
