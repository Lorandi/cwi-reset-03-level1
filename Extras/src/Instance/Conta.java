package Instance;

public class Conta {
    private double saldo;

    static private Conta instance = null;

    private Conta() {

    }

    static Conta getInstance() {
        if (instance == null)
            instance = new Conta();
        return instance;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
