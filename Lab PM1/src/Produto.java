import java.nio.channels.Pipe.SourceChannel;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double valorProduto;
    private int quantidade;
    private int quantidadeTotal = 0;
    private int ESTOQUEMINIMO = 5;

    public Produto(int codProduto, String nomeProduto, double valorProduto, int quantidade, int quantidadeTotal, int ESTOQUEMINIMO) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
        this.quantidadeTotal = quantidadeTotal;
        this.ESTOQUEMINIMO = ESTOQUEMINIMO;
    }

    public void imprimeProduto() {
        System.out.println("Codigo Produto: " + this.codProduto);
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Valor do Produto: " + this.valorProduto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Quantidade total: " + this.quantidadeTotal);
        System.out.println("Estoque Minimo: " + this.ESTOQUEMINIMO);
    }
}
