import Service.RelatorioService;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;
import repository.DadosMock;

import java.util.List;
import java.util.Scanner;

public class SistemaVendasCLI {

    public static void main(String[] args) {

        List<Produto> produtos = DadosMock.getProdutos();
        List<Cliente> clientes = DadosMock.getClientes();
        List<Vendedor> vendedores = DadosMock.getVendedores();
        List<Venda> vendas = DadosMock.getVendas(produtos, clientes, vendedores);

        RelatorioService relatorioService = new RelatorioService(vendas);

        Scanner scanner = new Scanner(System.in);
        boolean comtinue = true;
        while (comtinue) {
            System.out.println("\nSistema de Vendas - Relatórios");
            System.out.println("1. Ranking de vendedores por valor vendido");
            System.out.println("2. Total de vendas por cidade do cliente");
            System.out.println("3. Produto mais vendido por quantidade");
            System.out.println("4. Ticket médio por vendedor");
            System.out.println("5. Relatório mensal de vendas");
            System.out.println("6. Clientes que mais compraram");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> relatorioService.rankingVendedores();
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    comtinue = false;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

    }

}
