package ByteBank_encapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //Cliente titular = new Cliente();

    private static int total;
    // atributo static se refere a toda a classe e não a cada objeto instanciado.


    public Conta(double saldo, int agencia, int numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;

        total++;
        //System.out.println("Total de classes instanciadas " + total);
        //Conta.total++ tb funcionaria
        //System.out.println("Total de classes instanciadas " + Conta.total);
    }

    public boolean deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Valores de deposito devem ser positivos");
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    public void depositaMais(double valor) {
        deposita(valor);
    }

    public boolean saca(double valor) {
        if (valor <= this.getSaldo()) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Sem saldo suficiente para esta operação");
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            System.out.println("Transferido R$" + valor + " da conta de " + this.titular.getNome() + " para conta de " + destino.titular.getNome());
            return true;
        }
        System.out.println("Sem saldo suficiente para transferir R$" + valor + " da conta de " + this.titular.getNome() + " para conta de "
                + destino.titular);
        return false;
    }


    //getter e setters

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
