package model;

public class Produto {

    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome, String categoria, double preco, int quantidadeEstoque, boolean ativo) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.ativo = ativo;
    }

    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public boolean isAtivo() { return ativo; }

    @Override
    public String toString() {
        return String.format("Produto: %s | Categoria: %s | Preço: R$ %.2f | Quantidade: %s | Ativo: %s",
                nome, categoria, preco, quantidadeEstoque, ativo ? "Sim" : "Não");
    }

}
