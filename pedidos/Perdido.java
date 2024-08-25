import java.util.*;

public class Perdido {
    private String numero;
    private String data;
    private List<ItemPerdido> itens;

    public Perdido(String numero, String data) {
        this.numero = numero;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ItemPerdido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPerdido item) {
        itens.add(item);
    }

    public void removerItem(ItemPerdido item) {
        itens.remove(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (ItemPerdido item : itens) {
            valorTotal += item.valorTotal();
        }
        return valorTotal;
    }
}
