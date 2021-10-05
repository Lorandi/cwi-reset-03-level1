package ByteBank_herdado;

public class Administrador extends Funcionario implements Autenticavel{


    private AutenticacaoUtil autenticador;

    public Administrador(AutenticacaoUtil autenticador) {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }


    @Override
    public double getBonificacao() {
        System.out.println("Passou na bonificação da classe administrador");
        return 50;
    }


}
