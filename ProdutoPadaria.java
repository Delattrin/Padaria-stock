public class ProdutoPadaria extends ProdutoPerecivel implements Estocavel{
    private String tipoPao;
    public void restock(int quantidade) {
        // soma no estoque — mas como acessar quantidade se ela é privada em Produto?
                this.setQuantidade(this.getQuantidade() + quantidade);


    }

    public boolean isCritical() {
        // retorna true se quantidade < 10
        return this.getQuantidade() < 10;
    }




    public ProdutoPadaria(String tipoPao, String dataValidade, String nome, double preco, int quantidade) {
        super(dataValidade, nome, preco, quantidade);
        this.tipoPao = tipoPao;
    }

    public void descricao(){
        super.descricao();
        System.out.println("Tipo de pão: " + tipoPao);
    }
    }

