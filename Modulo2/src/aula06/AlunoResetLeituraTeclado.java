package aula06;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.next();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo: " + nome);

    }
}
