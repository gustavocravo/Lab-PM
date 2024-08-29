import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.of(2024, 8, 21);
        System.out.println("Data: " + date);

        LocalDate date2 = LocalDate.of(2003, 7, 23);

        Cliente cliente1 = new Cliente(1, "Gustavo", "13323456554", "gustavo@gmail", date2);
        cliente1.imprimirCliente();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Endereco endereco1 = new Endereco(31030040, 189, "Sagradinha", "Manoel Fernando", "Casa", "Belo Horizonte", "MG", 4353342);
        endereco1.imprimirEndereco();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Produto produto1 = new Produto(231423, "iPhone 15 Pro Max", 10000, 5, 15, 5);
        produto1.imprimeProduto();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Categoria categoria1 = new Categoria(23423, "Celulares ", "Tecnologia");
        categoria1.imprimirCategoria();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Orcamento orcamento1 = new Orcamento(4232342, 20000, 5000);
        orcamento1.imprimeOrcamento();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        ItemDeOrcamento itemdeorcamento1 =  new ItemDeOrcamento(10);
        itemdeorcamento1.imprimeItemDeOrcamento();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

