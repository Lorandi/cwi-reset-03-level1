package ByteBank_herdado;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Passou na bonificação da classe designer");
		return 200;
	}	

}