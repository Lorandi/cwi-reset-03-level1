package ByteBank_herdado;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        System.out.println("Passou por aqui");
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }

}