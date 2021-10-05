package aula10;

import java.util.Scanner;

public class Exercicio2Aula10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayIdades = new int[10];
        int maioresDeIdade = 0;

        for (int i = 0; i < arrayIdades.length; i++){
            System.out.println("Digite a " + (i + 1) + "º idade");
            arrayIdades[i] = scan.nextInt();
            if(arrayIdades[i]>=18){
                maioresDeIdade++;
            }
        }
        for(int idade : arrayIdades){
            System.out.println(idade);
        }
        System.out.println("Maiores de 18: " + maioresDeIdade);
    }
}
