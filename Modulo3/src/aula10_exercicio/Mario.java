package aula10_exercicio;

public class Mario extends Personagem {
    private Yoshi yoshi;

    public Mario(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    public void montarNoYoshi(Yoshi yoshi){
        this.yoshi = yoshi;
    }


    public void imprimeMontadoYoshi(){
        if(this.yoshi != null){
            System.out.println("Mario está montado no Yoshi");
        }else{
            System.out.println("Mario não está montado no Yoshi");
        }
    }

    @Override
    public void crescer() {
        this.setAltura(this.getAltura() + this.getAltura()*0.50 );
    }

}
