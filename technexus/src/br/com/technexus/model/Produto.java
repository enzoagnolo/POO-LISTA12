package br.com.technexus.model;

public class Produto {

    private String nome;
    private String categoria;
    private double preco;

    public Produto(String categoria, String nome, double preco) {
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
    }


}
