package aula08;

public class Exercio1Aula08 {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 8;
        double nota3 = 9;
        double nota4 = 10;

        double media = (nota1+nota2+nota3+nota4)/4;

        if(media == 10){
            System.out.println("Aluno aprovado com louvores");
        }else if(media >= 7 ){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno Reprovado");
        }
    }
}
