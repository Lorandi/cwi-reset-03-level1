package HackerRank;

import java.util.Scanner;

public class ToArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============primeiro==================");
        for (int i = 0; i < 1; i++) {
            System.out.println("Digite string");
            String s1 = sc.next();
            System.out.println("Digite número");
            int x = sc.nextInt();
            String[] stringArray = s1.split("");
            for (int j = 0; j < stringArray.length; j++) {
                    System.out.print(stringArray[j]);
            }
            if(stringArray.length < 15){
                for(int k = 0; k < (15 - stringArray.length); k++){
                    System.out.print(" ");
                }
            }
            if(x < 10){
                System.out.print("00" + x);
            }else if (x < 100){
                System.out.print("0"+ x);
            } else{
                System.out.print(x);
            }
        }
        System.out.println("");
        System.out.println("================================");
        sc.close();
    }

}
