import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.of(2024, 8, 21);
        System.out.println("Data: " + date);

        Cliente cliente1 = new Cliente(1, "Gustavo", "13323456554", "gustavo@gmail", date);
        cliente1.imprimirCliente();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Endereco endereco1 = new Endereco(31030050, 190, "Proximo lago", "Rua Pereira Lima", "Casa", "Contagem", "MG");
        endereco1.imprimirEndereco();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Categoria categoria1 = new Categoria(4232425, "Iphone 15 Pro Max");
        categoria1.imprimirCategoria();
    }
}

