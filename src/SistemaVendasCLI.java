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
<<<<<<< HEAD
            System.out.println("\n");
=======
>>>>>>> b6121c712825240f2289c348f318d250757a9511

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
<<<<<<< HEAD
            System.out.println("2. Filtrar produtos com estoque abaixo de 20");
            System.out.println("3. Listar nomes dos produtos");
            System.out.println("4. Listar nomes da categoria 'Papelaria'");
            System.out.println("5. Calcular valor total do estoque");
            System.out.println("6. Listar os 3 produtos mais caros");

=======
            System.out.println("2. Listar Alunos");
            System.out.println("3. Editar Aluno");
            System.out.println("4. Excluir Aluno");
>>>>>>> b6121c712825240f2289c348f318d250757a9511
            System.out.println("0. Voltar");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> RelatoriosProduto.listarProdutosOrdenadosPorNome(produtos);
<<<<<<< HEAD
                case 2 -> RelatoriosProduto.filtrarEstoqueAbaixoDe20(produtos);
                case 3 -> RelatoriosProduto.listarNomesProdutos(produtos);
                case 4 -> RelatoriosProduto.listarNomesProdutosCategoriaPapelaria(produtos);
                case 5 -> RelatoriosProduto.calcularValorTotalEstoque(produtos);
                case 6 -> RelatoriosProduto.listarTop3ProdutosPreco(produtos);
                case 0 -> System.out.println("Voltando ao menu principal...");
=======
                case 0 -> {
                    System.out.println("Voltando ao menu principal...");
                    scanner.close();
                }
>>>>>>> b6121c712825240f2289c348f318d250757a9511
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

}
