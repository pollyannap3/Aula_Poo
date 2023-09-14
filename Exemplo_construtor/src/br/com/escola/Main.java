package br.com.escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setRa("12345678");
        aluno1.setNotaAv1(40);
        aluno1.setNotaAv2(50);
        System.out.println("Aluno 1: "+ aluno1.getNome()+ "\n" +"RA: " + aluno1.getRa());
        Aluno aluno2 = new Aluno("Anna","123444");
        System.out.println("Aluno 2: "+ aluno2.getNome()+ "\n"+ "RA: " + aluno2.getRa());
        Aluno aluno3 = new Aluno("joão","7363636",40.5f,30.7f);
        System.out.println("Aluno 3: "+ aluno3.getNome()+ "\n" +"RA: "+ aluno3.getRa() + "\nSoma das notas: "+(aluno3.getNotaAv1() + aluno3.getNotaAv2()));
}
}