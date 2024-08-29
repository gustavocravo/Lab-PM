public class Orcamento {
    private int codOrcamento;
    private double valorTotal;
    private double desconto;

    public Orcamento(int codOrcamento, double valorTotal, double desconto) {
        this.codOrcamento = codOrcamento;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public void imprimeOrcamento() {
        System.out.println("Codigo do Orçamento: " + this.codOrcamento);
        System.out.println("Valor total: " + this.valorTotal);
        System.out.println("Desconto: " + this.desconto);
    }
}
