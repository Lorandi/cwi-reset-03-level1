package aula05;

public class Contas {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");


        conta1.depositar(100);
        conta2.depositar(500);

        conta1.sacar(100);
        conta2.sacar(400);

        conta1.sacar(100);
        conta2.sacar(400);

        conta1.pagarMensal();
        conta2.pagarMensal();

        conta1.fecharConta();
        conta2.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();

    }
}
