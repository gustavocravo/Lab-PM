import java.util.ArrayList;
import java.time.LocalDate;

public class Cliente {
        private int codCliente;
        private String nome;
        private String CPF;
        private String email;
        private LocalDate dataNasc;

        public Cliente(int codCliente, String nome, String email, LocalDate dataNasc) {
                this.codCliente = codCliente;
                this.nome = nome;
                this.CPF = CPF;
                this.email = email;
                this.dataNasc = dataNasc;
        }

        public void imprimeCliente() {
                System.out.println("Nome: " + this.nome);
                System.out.println("Email: " + this.email);
        }
}
