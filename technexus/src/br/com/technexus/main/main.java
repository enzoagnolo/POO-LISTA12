package br.com.technexus.main;

import br.com.technexus.model.Loja;
import br.com.technexus.model.Produto;

public class main {

    public static void main(String[] args) {

        Loja loja = new Loja();

        Produto p1 = new Produto("GAMES", "The Witcher", 150.00);
        Produto p2 = new Produto("GAMES", "FIFA", 200.00);

        Produto p3 = new Produto("LIVROS", "Java for Dummies", 100.00);
        Produto p4 = new Produto("LIVROS", "Clean Code", 80.00);

        Produto p5 = new Produto("HARDWARE", "Mouse", 50.00);

        loja.cadastrar(p1);
        loja.cadastrar(p2);
        loja.cadastrar(p3);
        loja.cadastrar(p4);
        loja.cadastrar(p5);

        System.out.println("Produtos da categoria GAMES:");
        System.out.println(loja.buscarPorCategoria("GAMES"));

        System.out.println("Patrimônio total da loja: R$ "
                + loja.calcularPatrimonioTotal());

        System.out.println("Total da categoria LIVROS: R$ "
                + loja.calcularTotalPorCategoria("LIVROS"));
    }
}