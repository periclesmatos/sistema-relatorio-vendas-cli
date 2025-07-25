package model;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private boolean ativo;

    public Produto(String nome, String categoria, double preco, boolean ativo) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.ativo = ativo;
    }

    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public boolean isAtivo() { return ativo; }
}
