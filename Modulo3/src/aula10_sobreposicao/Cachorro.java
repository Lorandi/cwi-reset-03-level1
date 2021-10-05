package aula10_sobreposicao;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    @Override
    public void olhosAbertos() {
        System.out.println("Olhos fechados");
    }
}
