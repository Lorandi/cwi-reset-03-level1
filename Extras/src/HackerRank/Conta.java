package HackerRank;

public class Conta{
    double saldo;
    public static void main(String [] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 500.0;
        Conta outraConta = minhaConta;
        outraConta.saldo += 1000;
        System.out.println(minhaConta.saldo);       // 1500.0
        System.out.println(outraConta.saldo);       // 1500.0
    }
}
