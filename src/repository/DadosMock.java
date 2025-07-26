package repository;

import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DadosMock {

    public static List<Produto> getProdutos() {
<<<<<<< HEAD
        Produto p1 = new Produto("Notebook", "Informática", 3500, 5, true);
        Produto p2 = new Produto("Mouse", "Informática", 20, 150, true);
        Produto p3 = new Produto("Teclado", "Informática", 30, 300, true);
        Produto p4 = new Produto("Cadeira", "Móveis", 1200, 15, true);
=======
        Produto p1 = new Produto("Notebook", "Informática", 3500, 15, true);
        Produto p2 = new Produto("Mouse", "Informática", 20, 150, true);
        Produto p3 = new Produto("Teclado", "Informática", 30, 300, true);
        Produto p4 = new Produto("Cadeira", "Móveis", 1200, 25, true);
>>>>>>> b6121c712825240f2289c348f318d250757a9511
        Produto p5 = new Produto("Caneta", "Papelaria", 2.99, 100, true);
        Produto p6 = new Produto("Caderno", "Papelaria", 19.99, 50, true);
        Produto p7 = new Produto("Lápis", "Papelaria", 1.49, 500, true);
        return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
    }

    public static List<Cliente> getClientes() {
        Cliente c1 = new Cliente("Ana Silva", "ana@email.com", "São Paulo");
        Cliente c2 = new Cliente("Carlos Souza", "carlos@email.com", "Rio de Janeiro");
        Cliente c3 = new Cliente("Mariana Lima", "mariana@email.com", "São Paulo");
        return Arrays.asList(c1, c2, c3);
    }

    public static List<Vendedor> getVendedores() {
        Vendedor v1 = new Vendedor("João", "Vendas");
        Vendedor v2 = new Vendedor("Maria", "Vendas");
        Vendedor v3 = new Vendedor("Pedro", "Vendas");
        return Arrays.asList(v1, v2, v3);
    }

    public static List<Venda> getVendas(List<Produto> produtos, List<Cliente> clientes, List<Vendedor> vendedores) {
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(produtos.get(0), clientes.get(0), vendedores.get(0), LocalDate.of(2024, Month.MARCH, 10), 2, 10));
        vendas.add(new Venda(produtos.get(1), clientes.get(1), vendedores.get(1), LocalDate.of(2024, Month.MARCH, 15), 5, 0));
        vendas.add(new Venda(produtos.get(2), clientes.get(2), vendedores.get(0), LocalDate.of(2024, Month.APRIL, 2), 3, 5));
        vendas.add(new Venda(produtos.get(3), clientes.get(0), vendedores.get(2), LocalDate.of(2024, Month.MARCH, 22), 1, 15));
        vendas.add(new Venda(produtos.get(0), clientes.get(1), vendedores.get(1), LocalDate.of(2024, Month.APRIL, 10), 1, 0));
        vendas.add(new Venda(produtos.get(2), clientes.get(2), vendedores.get(2), LocalDate.of(2024, Month.MAY, 5), 4, 10));
        return vendas;
    }

}
