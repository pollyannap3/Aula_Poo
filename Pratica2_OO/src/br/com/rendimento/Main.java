package br.com.rendimento;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do rendimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numero de meses para o rendimento: ");
        int numMeses = ler.nextInt();

        Rendimento r1 = new Rendimento(vrInicial, txJuros, numMeses);
        r1.calculaRendimento();
    }

}