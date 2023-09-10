package NotasAlunos;
public class MainAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ("Anna", "ADS", 20, 30, 0, 123, 3);

        System.out.println(aluno1.avaliarAluno());
        System.out.println(aluno1.avaliarRecuperacao());

        aluno1.alteraNotaAE(70);

        System.out.println("Alterar nota da prova especial");
        System.out.println(aluno1.avaliarRecuperacao());


    }

}