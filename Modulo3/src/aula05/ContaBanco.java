package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual() {
        System.out.println(" ");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println(" ");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta do " + this.getDono() + " aberta com sucesso");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if(this.getSaldo()< 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dívida");
        } else{
            this.setStatus(false);
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Não há saldo suficiente para este saque");
            }
        }else{
            System.out.println("Impossível sacar de  uma conta fechada");
        }
    }

    public void pagarMensal() {
        int mensalidade = 0;
        if (this.getTipo() == "CC"){
            mensalidade = 12;
        }else if (this.getTipo() == "CP"){
            mensalidade = 20;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + " no valor de R$" + mensalidade);
        } else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }

    //Métodos especiais


    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
