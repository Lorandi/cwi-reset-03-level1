package aula08;

import java.util.Random;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11,2,1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2,3);
        l[2] = new Lutador("Snapshadow", "EUA",35, 1.65f, 80.9f, 13, 0, 2);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13,0,2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,119.3f, 5,4,3);
        l[5] = new Lutador("Berdaart", "EUA", 30, 1.81f, 105.7f, 12, 2,4);

        int i = 0;

        do{
            System.out.println("#### Luta " + ( i + 1) + "####");
            Luta UEC01 = new Luta();
            Random lutadorAleatorio = new Random();
            int l1 = lutadorAleatorio.nextInt(5);
            int l2 = lutadorAleatorio.nextInt(5);

            System.out.println(l[l1].getNome()+" vs "+ l[l2].getNome());

            UEC01.marcarLuta(l[l1],l[l2]);
            UEC01.lutar();
            System.out.println("#### Fim da luta #####");
            System.out.println(" ");
            i++;
        }while (i <= 30);

    }
}
