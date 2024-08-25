public class produto {
    String nome;
    float preco;
    int quantidadeEstoque;

    // Construtor
    public produto(String nome, float preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para adicionar produtos ao estoque
    public void adicionar(int quantidade) {
        System.out.println("Adicionar produto");

        if (quantidadeEstoque == 0) {
            System.out.println("Estoque vazio, adicionando produto...");
            quantidadeEstoque += quantidade;
        } else {
            quantidadeEstoque += quantidade;
            System.out.println("Produto adicionado!");
        }
    }

    // Método para remover produtos do estoque
    public void remover(int quantidade) {
        System.out.println("Remover produto");
        if (quantidadeEstoque == 0) {
            System.out.println("Estoque vazio");
        } else if (quantidade < 0) {
            System.out.println("Não se pode retirar quantidades negativas");
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Quantidade maior que o estoque disponível");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Produto removido!");
        }
    }

    // Método para ajustar o preço do produto
    public void ajustarPreco(float percentual) {
        System.out.println("Ajustar preços");
        preco += preco * (percentual / 100);
        System.out.println("Novo preço: R$" + preco);
    }
}
