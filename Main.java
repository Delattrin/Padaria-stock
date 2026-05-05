import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ProdutoPadaria paoFrances = new ProdutoPadaria("frances", "2024-10-15", "pao frances", 2.00, 5);
        ProdutoPadaria paoIntegral = new ProdutoPadaria("integral", "2024-09-20", "pao integral", 3.00, 20);
        ProdutoBebida suco = new ProdutoBebida("suco", 5.00, 3, 1.5);
        ProdutoBebida agua = new ProdutoBebida("agua", 2.00, 300, 0.5);
        ProdutoPerecivel leite = new ProdutoPerecivel("2024-12-31", "leite", 3.50, 200);
        Produto bolo = new Produto("bolo", 55.00, 8);

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(paoFrances);
        produtos.add(paoIntegral);
        produtos.add(suco);
        produtos.add(agua);
        produtos.add(leite);
        produtos.add(bolo);

        ArrayList<Estocavel> estocaveis = new ArrayList<Estocavel>();
        estocaveis.add(paoFrances);
        estocaveis.add(suco);

        System.out.println("=== ESTOQUE CRÍTICO ===");
        for (Estocavel e : estocaveis) {
            if (e.isCritical()) {
                System.out.println("ALERTA: " + ((Produto) e).getNome() + " - Quantidade: " + ((Produto) e).getQuantidade());
                e.restock(20);
                System.out.println("Reabastecido! Novo estoque: " + ((Produto) e).getQuantidade());
            }
        }

        System.out.println("\n=== TODOS OS PRODUTOS ===");
        Produto maisCaro = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
            p.descricao();
        }

        System.out.println("Produto mais caro: " + maisCaro.getNome() + " - R$" + maisCaro.getPreco());
    }
}