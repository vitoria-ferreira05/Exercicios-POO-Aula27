package Exercicio1;

public  class CDs extends ProdutosLoja{
    private int numeroDeFaixas;
    public CDs(String nome, double preco, int numeroDeFaixas, String codigoDeBarras) {
        super(nome, preco,codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoltem(String nome, double preco, int numeroDeFaixas, String codigoDeBarras) {

    }

}
