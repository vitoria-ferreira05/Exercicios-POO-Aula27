package Exercicio1;

public  class Livros extends ProdutosLoja{
    private String autor;
    public Livros(String nome, double preco, String autor, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoltem(String nome, double preco, String autor, String codigoDeBarras) {
        super.mostrarDetalhesDoltem();
    }
}
