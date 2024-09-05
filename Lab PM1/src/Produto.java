import java.nio.channels.Pipe.SourceChannel;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double valorProduto;
    private int quantidade;
    private int quantidadeTotal = 0;
    private final int ESTOQUEMINIMO = 5;

    // Construtor
    public Produto(int codProduto, String nomeProduto, double valorProduto, int quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
    }

    // Getters
    public int getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean removeEstoque(int qtde) {
        if (temEstoque(qtde)) {
            this.quantidade -= qtde;
            verificaEstoqueSeguranca();
            return true;
        }
        return false;
    }

    public void addEstoque(int qtde) {
        this.quantidade += qtde;
    }

    public boolean temEstoque(int qtde) {
        return this.quantidade >= qtde;
    }

    private void verificaEstoqueSeguranca() {
        if (this.quantidade < ESTOQUEMINIMO) {
            geraPedidoCompra();
        }
    }

    private void geraPedidoCompra() {
        System.out.println("Gerando pedido de compra para o produto: " + nomeProduto);
    }

    public void imprimeProduto() {
        System.out.println("Codigo Produto: " + this.codProduto);
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Valor do Produto: " + this.valorProduto);
        System.out.println("Quantidade: " + getQuantidade());
        verificaEstoqueSeguranca();
    }

}
