package ByteBank_encapsulado;

public class CriaConta {
    public static void main(String[] args) {
        Conta contaRodrigo = new Conta(100, 21321, 121);
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");
        rodrigo.setCpf("999-999-999-99");
        rodrigo.setProfissao("Desenvolvedor");
        contaRodrigo.setTitular(rodrigo);

        Conta contaPedro = new Conta(50, 9874, 98);
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        pedro.setCpf("111.111.111-11");
        pedro.setProfissao("Agilista");
        contaPedro.setTitular(pedro);


        contaRodrigo.deposita(1000);

        contaRodrigo.transfere(99, contaPedro);

        System.out.println("Saldo da conta de " + contaRodrigo.getTitular().getNome() + " é " + contaRodrigo.getSaldo());
        System.out.println("Saldo da conta de " + contaPedro.getTitular().getNome() + " é " + contaPedro.getSaldo());

        System.out.println("Total de classes instanciadas " + Conta.getTotal());

    }
}
