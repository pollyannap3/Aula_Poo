package br.com.pagamento;

public class Main {
    public static void main(String[] args) {
        FPadrao fp = new FPadrao(1, "Jennifer", 10000);
        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2, "João", 1500, 2, 10000);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(1,"Pedro", 1200, 0.50, 100);
        System.out.println(fpr.toString());
    }
}
