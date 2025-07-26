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

}
