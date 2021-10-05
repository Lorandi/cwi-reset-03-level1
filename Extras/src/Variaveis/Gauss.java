package Variaveis;

public class Gauss {
    public static void main(String[] args) {
        int total = 0;
        int voltas = 0;

        while(voltas <= 16){
            total = total + voltas;
            System.out.println(total);
            voltas++;
        }

    }
}
