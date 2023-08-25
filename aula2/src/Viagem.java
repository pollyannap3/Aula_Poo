import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) { //psvm + tab

        double velocidade, tempo, distancia, kmLitro, consumo;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade: "); //sout + tab
        velocidade = ler.nextDouble();
        System.out.println("Digite o tempo gasto: ");
        tempo = ler.nextDouble();
        System.out.println("Digite Km/litro: ");
        kmLitro = ler.nextDouble();
        distancia = velocidade*tempo;
        consumo = distancia/kmLitro;
        System.out.println("Consumo medio: " + consumo);
    }
}
