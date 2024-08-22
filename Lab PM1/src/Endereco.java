public class Endereco {
    private int cep;
    private int numero;
    private String ref;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;

    public Endereco(int cep, int numero, String ref, String logradouro, String complemento, String cidade,
            String estado) {
        this.cep = cep;
        this.numero = numero;
        this.ref = ref;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void imprimirEndereco() {
        System.out.println("Cep: " + this.cep);
        System.out.println("Numero: " + this.numero);
        System.out.println("Referencia:  " + this.ref);
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
    }

}
