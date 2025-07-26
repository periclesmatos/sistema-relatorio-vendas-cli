package service;

import model.Produto;

import java.util.Comparator;
import java.util.List;

public class RelatoriosProduto {

    public static void listarProdutosOrdenadosPorNome(List<Produto> produtos) {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getNome))
                .forEach(System.out::println);
    }

    public static void filtrarEstoqueAbaixoDe20(List<Produto> produtos) {
        produtos.stream()
                .filter(p -> p.getQuantidadeEstoque() < 20)
                .forEach(System.out::println);
    }

    public static void listarNomesProdutos(List<Produto> produtos) {
        produtos.stream()
                .map(Produto::getNome)
                .forEach(System.out::println);
    }

    public static void listarNomesProdutosCategoriaPapelaria(List<Produto> produtos) {
        produtos.stream()
                .filter(p -> p.getCategoria().equals("papelaria"))
                .map(Produto::getNome)
                .forEach(System.out::println);
    }

    public static void calcularValorTotalEstoque(List<Produto> produtos) {
        int quantiadeTotalEstoque = produtos.stream()
                .map(Produto::getQuantidadeEstoque)
                .reduce(0, Integer::sum);

        System.out.println("Total em estoque: " + quantiadeTotalEstoque);
    }

    public static void listarTop3ProdutosPreco(List<Produto> produtos) {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

}
