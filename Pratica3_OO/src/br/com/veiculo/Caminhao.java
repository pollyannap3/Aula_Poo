package br.com.veiculo;

public class Caminhao extends Veiculo{
    public int eixos;


    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String exibirDados() {
        return "Placa: " + getPlaca() + "\tAno: " +getAno() + "\tNúmero de eixos: " + getEixos();
    }
}
