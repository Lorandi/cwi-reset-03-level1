package ByteBank_herdado;

public class TesteSistema {
    public static void main(String[] args) {
        AutenticacaoUtil autenticador = new AutenticacaoUtil();
        Gerente g1 = new Gerente(autenticador);
        g1.setNome("Geee");
        g1.setSalario(3000);
        g1.setSenha(2222);

        SistemaInterno si = new SistemaInterno();

        Administrador adm = new Administrador(autenticador);
        adm.setSenha(2223);

        Cliente c = new Cliente(autenticador);
        c.setSenha(2224);


        si.autentica(g1);
        si.autentica(adm);
        si.autentica(c);
    }
}
