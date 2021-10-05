package aula09_aula;

public class ProjetoPessoas {
    public static void main(String[] args) {

        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();

        v1.setNome("Rodrigo");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1= new Aluno();
        a1.setNome("Claudio");
        a1.setMat(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();

       Bolsista b1 = new Bolsista();
       b1.setBolsa(12.5f);
       b1.setNome("Jailson");
       b1.pagarMensalidade();







    }
}
