package Exercicio1;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String [] vetor = {"Livro: Água para elefantes", "CD: Legião Urbana", "CD: Capital Inicial", "DVD: Titanic", "Livro: O pequeno principe"};

        System.out.println("PRODUTOS");
        for (int i =0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        ProdutosLoja [] produtosLoja = new ProdutosLoja[5];
        produtosLoja[0] = new ProdutosLoja("Livro: Água para elefantes", 29.90, "545646544");
        produtosLoja[1] = new ProdutosLoja("CD: Legião Urbana", 15.00, "545646544");

        System.out.println(produtosLoja.equals(produtosLoja));

        ProdutosLoja produtosDaLoja1 = new ProdutosLoja("Livro", 29.90, "545646544");
        ProdutosLoja produtosDaLoja2 = new ProdutosLoja("CD", 10.00, "6415745");
        ProdutosLoja produtosDaLoja3 = new ProdutosLoja("CD", 10.00, "6415745");
        ProdutosLoja produtosDaLoja4 = new ProdutosLoja("DVD", 5.00, "5967547452");
        ProdutosLoja produtosDaLoja5 = new ProdutosLoja("Livro", 19.90, "545646544");

      ProdutosLoja  []  vetorDoProduto = {produtosDaLoja1, produtosDaLoja2, produtosDaLoja3, produtosDaLoja4, produtosDaLoja5};

      ProdutosLoja buscaDoProduto = new ProdutosLoja("CD", 10.00, "6415745");

    ProdutosLoja.buscaDoProduto(buscaDoProduto, vetorDoProduto);

    }
}