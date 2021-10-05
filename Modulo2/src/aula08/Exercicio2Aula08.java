package aula08;

public class Exercicio2Aula08 {
    public static void main(String[] args) {
        int diaDaSemana = 9;


        switch (diaDaSemana){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sábado");break;
            default: System.out.println("Valor inválido");
        }

        System.out.println((diaDaSemana < 1 || diaDaSemana > 7) ? "diaDaSemana deve ser entre 1 e 7": diaDaSemana);
    }
}
