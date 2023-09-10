package NotasAlunos;

public class Aluno {
    private String nome, curso;
    private float notaAV1, notaAV2, notaAE;
    private int matricula, periodo;



    public Aluno(String nome, String curso, float notaAV1, float notaAV2, float notaAE, int matricula, int periodo) {
        super();
        this.nome = nome;
        this.curso = curso;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public void  alteraNotaAV1(float nota) {
        this.notaAV1 = nota;
    }

    public void  alteraNotaAV2(float nota) {
        this.notaAV2 = nota;
    }

    public void  alteraNotaAE(float nota) {
        this.notaAE = nota;
    }
    public String avaliarAluno() {

        if((this.notaAV1 + this.notaAV2) >= 60)
            return"Aprovado";
        else
            return "Recuperacao";

    }
    public String avaliarRecuperacao() {
        if((this.notaAV1+this.notaAV2+this.notaAE)/2>=60)
            return "Aprovado";
        else
            return "Reprovado";

    }
}