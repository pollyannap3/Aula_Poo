package br.com.rendimento;
import java.text.NumberFormat;

public class Rendimento {
    private Double investimentoInicial;
    private Double taxaRendimento;
    private int numMeses;
    public Rendimento (double investimentoInicial,double taxaRendimento, int numMeses){
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public Double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(Double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }
    public void calculaRendimento() {
        double rendimentoMes;
        rendimentoMes = getInvestimentoInicial();
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial()));
        System.out.println("Valor Inicial: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));

        for(int i=0; i<getNumMeses();i++) {
            rendimentoMes = rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
            System.out.println("Mês " + (i+1) +": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }

    }
}
