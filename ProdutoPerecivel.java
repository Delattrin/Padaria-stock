public class ProdutoPerecivel extends Produto{
    private String dataValidade;
    public ProdutoPerecivel(String dataValidade, String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    public void descricao(){
        super.descricao();
        System.out.println("Data de validade: " + dataValidade);
    }
}
