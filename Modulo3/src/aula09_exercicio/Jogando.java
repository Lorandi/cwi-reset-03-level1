package aula09_exercicio;

public class Jogando {
    public static void main(String[] args) {
        // Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        // Teste para verificar se o Mario monta no Yoshi
        mario.imprimeMontadoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.imprimeMontadoYoshi();

        // Teste para verificar se o Luigi voa
        luigi.voar();

        // Teste para verificar se a velocidade do yoshi aumenta a cada 2 frutas comidas
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());

    }
}
