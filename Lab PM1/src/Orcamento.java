import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private int codOrcamento;
    private double valorTotal;
    private double desconto;
    private List<ItemDeOrcamento> itens;

    public Orcamento(int codOrcamento, double valorTotal, double desconto) {
        this.codOrcamento = codOrcamento;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.itens = new ArrayList<>();
    }

    public boolean adicionarItem(ItemDeOrcamento item) {
        return this.itens.add(item);
    }

    public void confirmarPgtos() {
        System.out.println("Pagamentos confirmados.");
    }

    public void imprimeOrcamento() {
        System.out.println("Codigo do Orçamento: " + this.codOrcamento);
        System.out.println("Valor total: " + this.valorTotal);
        System.out.println("Desconto: " + this.desconto);
    }

}
