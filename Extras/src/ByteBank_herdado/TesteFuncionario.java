package ByteBank_herdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        AutenticacaoUtil autenticador = new AutenticacaoUtil();

        Gerente g1 = new Gerente(autenticador);
        g1.setNome("Geee");
        g1.setSalario(3000);
//        g1.setSenha(222);


//        System.out.println(g1.autentica(32));
//        System.out.println(g1.getBonificacao());



        Funcionario g2 = new Gerente(autenticador);
        g2.setNome("Zé");
        g2.setSalario(3000);
//        System.out.println(g2.getBonificacao());


        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        System.out.println(controle.getSoma());
        System.out.println("");

        controle.registra(ev);
        System.out.println(controle.getSoma());
        System.out.println("");

        controle.registra(d);
        System.out.println(controle.getSoma());
        System.out.println("");


    }
}
