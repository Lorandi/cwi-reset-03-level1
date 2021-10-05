package ByteBank_herdado;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Passou na bonificação da classe Editor");
		return super.getSalario();
	}	

}