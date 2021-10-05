package aula10_soobrecarga;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
