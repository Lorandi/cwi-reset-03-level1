package Instance;

public class TesteConta {
    public static void main(String[] args) {

        Conta conta1 = Conta.getInstance();
        Conta conta2 = Conta.getInstance();
        Conta conta3 = Conta.getInstance();

        conta1.setSaldo(500);
        conta2.setSaldo(100);
        conta3.setSaldo(200);
        conta1.setSaldo(100);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());
    }
}
