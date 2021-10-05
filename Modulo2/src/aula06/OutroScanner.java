package aula06;

import java.util.Scanner;

public class OutroScanner {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        while (sc.hasNext()) { // fica pedindo para digitar
            i++;
            System.out.println("Token: " + sc.next());
            System.out.println(i);
        }
        sc.close(); //Encerra o programa

    }

}


