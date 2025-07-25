package model;

public class Vendedor {
    private String nome;
    private String setor;

    public Vendedor(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() { return nome; }
    public String getSetor() { return setor; }
}
