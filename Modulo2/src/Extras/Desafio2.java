package Extras;

public class Desafio2 {
    public static void main(String[] args) {
        int[] array1 = {4, 6, 8, 10, 12, 14};
        int[] array2 = {3, 5, 6, 9, 12, 13, 15};
        int[] array3 = {7, 14, 21, 25, 28, 35, 37, 39, 42};
        int[] array4 = {6, 8, 18, 23, 28, 30};
        int[] array5 = {5, 10, 20, 30, 45, 50};

        System.out.println(imprimirMultiplos(array1));
        System.out.println(imprimirMultiplos(array2));
        System.out.println(imprimirMultiplos(array3));
        System.out.println(imprimirMultiplos(array4));
        System.out.println(imprimirMultiplos(array5));
    }

    static String imprimirMultiplos(int[] array) {
        if (array[0] % 2 == 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] % array[0] == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] % 2 == 1 && array[i] % array[0] == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        } return " ";
    }
}

    /* public static String imprimirMultiplos(int[] array) {
        if (array[0] % 2 == 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] % array[0] == 0) {
                    System.out.println(array[i]);
                }
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] % 2 == 1 && array[i] % array[0] == 0) {
                    System.out.println(array[i]);
                }
            }
        }
        return " ";
    }
     */



