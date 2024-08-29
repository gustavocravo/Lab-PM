public class ItemDeOrcamento {
    private int quantidade;

    public ItemDeOrcamento(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimeItemDeOrcamento() {
        System.out.println("Quantidade de item de Orçamento: " + this.quantidade);
    }
}
