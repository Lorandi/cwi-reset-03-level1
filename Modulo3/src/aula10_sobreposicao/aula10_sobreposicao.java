package aula10_sobreposicao;

public class aula10_sobreposicao {
    public static void main(String[] args) {
        //Animal animal = new Animal(); //Animal is abstract, cannot be instantiated

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro cc = new Cachorro();


        c.locomover();
        cc.locomover();
        c.emitirSom();
        cc.emitirSom();

        c.olhosAbertos();
        cc.olhosAbertos();


    }
}
