package Extras;

public class Extra1 {
    public static void main(String[] args) {
        int[] array = {23, 21, 17, 12, 19, 3};
        int lowestInt = Integer.MAX_VALUE; //atribui maior valor possível para um int
        int secondLowestInt = Integer.MAX_VALUE;;

        //percorre todo o array e atribui à variável lowestInt o menor valor do array
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < lowestInt ){
                lowestInt = array[i];
            }
        }
        //percorre todo o array novamentge e atribui à variável secondLowestInt o menor valor do array que seja diferente de lowestInt
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < secondLowestInt && array[i] != lowestInt){
                secondLowestInt = array[i];
            }
        }
        System.out.println(lowestInt + secondLowestInt);
    }
}

        /*
        array1 = [8, 5, 2, 25, 14] //resultado deve ser 7
        array2 = [17, 1, 9, 6, 4, 12] //resultado deve ser 5
        array3 = [ 23, 21, 17, 12, 19, 3] //resultado deve ser 15
        */
