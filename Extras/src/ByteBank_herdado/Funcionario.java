package ByteBank_herdado;

//não pode instantciar essa classe pois é abstrata
public abstract class Funcionario{
   private String nome;
   private String cpf;
   private double salario;

    public abstract double getBonificacao();
    //método sem corpo, filhas concretas devem implementar

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
