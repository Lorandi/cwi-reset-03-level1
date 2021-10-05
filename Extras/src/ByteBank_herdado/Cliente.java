package ByteBank_herdado;

public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Cliente(AutenticacaoUtil autenticador) {
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
}
