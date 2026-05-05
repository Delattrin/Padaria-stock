public class ProdutoBebida  extends Produto implements Estocavel{
    private double volume;

    public ProdutoBebida(String nome, double preco, int quantidade, double volume) {
        super(nome, preco, quantidade);
        this.volume = volume;
    }

    public void descricao(){
        super.descricao();
        System.out.println("Volume: " + volume + "L");
    }

    public void restock(int quantidade) {
                this.setQuantidade(this.getQuantidade() + quantidade);
}

    public boolean isCritical() {
        return this.getQuantidade() < 10;
    }
}
