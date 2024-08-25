public class ItemPerdido {
    private String item;
    private int quantidade;
    private double preco;

    public ItemPerdido(String item, int quantidade, double preco) {
        this.item = item;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorTotal() {
        return quantidade * preco;
    }
}
