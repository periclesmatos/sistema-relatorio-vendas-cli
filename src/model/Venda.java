package model;

import java.time.LocalDate;

public class Venda {

    private Produto produto;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDate dataVenda;
    private int quantidade;
    private double desconto; // percentual

    public Venda(Produto produto, Cliente cliente, Vendedor vendedor, LocalDate dataVenda, int quantidade, double desconto) {
        this.produto = produto;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Produto getProduto() { return produto; }
    public Cliente getCliente() { return cliente; }
    public Vendedor getVendedor() { return vendedor; }
    public LocalDate getDataVenda() { return dataVenda; }
    public int getQuantidade() { return quantidade; }
    public double getDesconto() { return desconto; }

    public double valorTotal() {
        return produto.getPreco() * quantidade * (1 - desconto / 100);
    }

    @Override
    public String toString() {
        return String.format("""
        Venda:
          Produto: %s
          Cliente: %s
          Vendedor: %s
          Data: %s
          Quantidade: %d
          Desconto: %.2f%%
          Valor Total: R$ %.2f
        """,
                produto.getNome(),
                cliente.getNome(),
                vendedor.getNome(),
                dataVenda,
                quantidade,
                desconto,
                valorTotal()
        );
    }

}
