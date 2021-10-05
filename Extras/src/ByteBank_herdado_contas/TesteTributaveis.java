package ByteBank_herdado_contas;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,222);
        cc.deposita(100);

        SeguroDeVida sg = new SeguroDeVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);
        ci.registra(sg);

        System.out.println(ci.getTotalImposto());

    }
}
