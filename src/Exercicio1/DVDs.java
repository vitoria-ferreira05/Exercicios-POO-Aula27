package Exercicio1;

public class DVDs extends ProdutosLoja {
private double duracao;
    public DVDs(String nome, double preco, double duracao, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoltem(String nome, double preco,double duracao, String codigoDeBarras) {

    }
}
