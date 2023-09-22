package br.com.veiculo;

public class Main {
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("MGH222",2020,2);
        System.out.println(c1.exibirDados());

        Onibus o1 = new Onibus("HHT333",2019, 35);
        System.out.println(o1.exibirDados());

        Veiculo v1 = new Veiculo("JKL555",2010);
        System.out.println(v1.exibirDados());


    }
}
