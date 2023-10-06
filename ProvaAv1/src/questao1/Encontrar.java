package questao1;

public class Encontrar {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Fábio","abcd@gmail.com","123456");

        AchadoPerdido ap = new AchadoPerdido("Blusa", "Blusa Branca","Foto","Roupa","Rodoviária","5 de Outubro as 21:35","Disponivel");
        ap.buscarTitulo("Blusa");
        ap.visualizarDetalhes();


    }
}
