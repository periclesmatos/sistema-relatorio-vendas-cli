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
            System.out.println("\n---- MENU DE RELATÓRIOS ----");
            System.out.println("1. Realatorio de Produtos");
            System.out.println("2. Relatorio de Clientes");
            System.out.println("3. Relatorio de Vendas");
            System.out.println("0. Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> relatorioProdutos(produtos);
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

    private static void relatorioProdutos(List<Produto> produtos) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- MENU ALUNO ---");
            System.out.println("1. Listar produtos ordenados por nome");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Editar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Voltar");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> RelatoriosProduto.listarProdutosOrdenadosPorNome(produtos);
                case 0 -> {
                    System.out.println("Voltando ao menu principal...");
                    scanner.close();
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

}
