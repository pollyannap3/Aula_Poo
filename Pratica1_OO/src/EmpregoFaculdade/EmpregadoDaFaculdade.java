package EmpregoFaculdade;

public class EmpregadoDaFaculdade {

    private String nome;
    private double salario;
    private int horasAula;
    private double salarioFinal;



    EmpregadoDaFaculdade(String nome, double salario, int horasAula, double salarioFinal){
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
        this.salarioFinal = salarioFinal;
    }

    double getGastos(){
        return this.salarioFinal = this.salario + (40*horasAula);
    }

    String getInfo(){
        return "nome: " + this.nome + " com salario: " + this.salarioFinal;
    }



}
