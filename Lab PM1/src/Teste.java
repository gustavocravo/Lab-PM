import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.of(2024, 8, 21);
        System.out.println("Data " + date);

        Cliente cliente1 = new Cliente(1, "Gustavo", "13323456554", "gustavo@gmail", date) {
        cliente1.imprimeCliente();
        }
    }
}