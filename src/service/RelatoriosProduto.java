package service;

import model.Produto;

import java.util.Comparator;
import java.util.List;

public class RelatoriosProduto {

    private final List<Produto> produtos;

    public RelatoriosProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listarProdutosOrdenadosPorNome() {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getNome))
                .forEach(System.out::println);
    }

    public void filtrarEstoqueAbaixoDe20() {
        produtos.stream()
                .filter(p -> p.getQuantidadeEstoque() < 20)
                .forEach(System.out::println);
    }

    public void listarNomesProdutos() {
        produtos.stream()
                .map(Produto::getNome)
                .forEach(System.out::println);
    }

    public void listarNomesProdutosCategoriaPapelaria() {
        produtos.stream()
                .filter(p -> p.getCategoria().equals("papelaria"))
                .map(Produto::getNome)
                .forEach(System.out::println);
    }

    public void calcularValorTotalEstoque() {
        int quantiadeTotalEstoque = produtos.stream()
                .map(Produto::getQuantidadeEstoque)
                .reduce(0, Integer::sum);

        System.out.println("Total em estoque: " + quantiadeTotalEstoque);
    }

    public void listarTop3ProdutosPreco() {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

}
