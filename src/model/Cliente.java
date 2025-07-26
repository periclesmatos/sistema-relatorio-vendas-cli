package model;

public class Cliente {

    private String nome;
    private String email;
    private String cidade;

    public Cliente(String nome, String email, String cidade) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getCidade() { return cidade; }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Email: %s | Cidade: %s",
                nome, email, cidade);
    }

}
