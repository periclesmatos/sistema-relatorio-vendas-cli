import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;
import repository.DadosMock;
import service.RelatoriosProduto;

import java.util.List;
import java.util.Scanner;

public class SistemaVendasCLI {

    public static void main(String[] args) {

        List<Produto> produtos = DadosMock.getProdutos();
        List<Cliente> clientes = DadosMock.getClientes();
        List<Vendedor> vendedores = DadosMock.getVendedores();
        List<Venda> vendas = DadosMock.getVendas(produtos, clientes, vendedores);

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n---- Menu de Relatorios ----");
            System.out.println("1. Realatorio de Produtos");
            System.out.println("2. Relatorio de Vendedores");
            System.out.println("3. Relatorio de Vendas");
            System.out.println("0. Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("\n");

            switch (opcao) {
                case 1 -> menuRelatorioProdutos(produtos);
                case 2 -> System.out.println("Em desenvolvimento...");
                case 3 -> System.out.println("Em desenvolvimento..");
                case 0 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

    }

    private static void menuRelatorioProdutos(List<Produto> produtos) {
        RelatoriosProduto relatoriosProduto =  new RelatoriosProduto(produtos);
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Relatorios de Produtos ---");
            System.out.println("1. Listar produtos ordenados por nome");
            System.out.println("2. Filtrar produtos com estoque abaixo de 20");
            System.out.println("3. Listar nomes dos produtos");
            System.out.println("4. Listar nomes da categoria 'Papelaria'");
            System.out.println("5. Calcular valor total do estoque");
            System.out.println("6. Listar os 3 produtos mais caros");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> relatoriosProduto.listarProdutosOrdenadosPorNome();
                case 2 -> relatoriosProduto.filtrarEstoqueAbaixoDe20();
                case 3 -> relatoriosProduto.listarNomesProdutos();
                case 4 -> relatoriosProduto.listarNomesProdutosCategoriaPapelaria();
                case 5 -> relatoriosProduto.calcularValorTotalEstoque();
                case 6 -> relatoriosProduto.listarTop3ProdutosPreco();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

}
