package Exercicio1;

public class ProdutosLoja {
    private String nome;
    private double preco;
    private String codigoDeBarras;
    private ProdutosLoja[] produtosLoja;

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public ProdutosLoja(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarDetalhesDoltem() {
    }

    public void mostrarDetalhesDoltem(String nome, double preco, String autor, String codigoDeBarras) {

    }

    public void mostrarDetalhesDoltem(String nome, double preco, int numeroDeFaixas, String codigoDeBarras) {

    }

    public void mostrarDetalhesDoltem(String nome, double preco, double duracao, String codigoDeBarras) {

    }

    public boolean equals(ProdutosLoja codigoDeBarras) {
        if (this == codigoDeBarras) {
            return true;
        }else{
            return false;
        }
    }

    public static void buscarProduto(ProdutosLoja produtosLoja, ProdutosLoja[] vetorProdutos){
        for (int i = 0; i < vetorProdutos.length; i++){
                if (vetorProdutos[i].equals(produtosLoja)){
                    System.out.println("A posição do produto: " + i + " no vetor");
                    return;
                }
        }
        System.out.println("O produto nao esta no vetor");
    }
}
