package Service;

import model.Venda;

import java.util.List;

public class RelatorioService {

    private final List<Venda> vendas;

    public RelatorioService(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public void rankingVendedores() {
        System.out.println("---- Ranking de vendedores por valor vendido  ----");
        System.out.println(vendas);

    }

}
