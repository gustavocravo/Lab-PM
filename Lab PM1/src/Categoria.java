public class Categoria {
    private int codCategoria;
    private String nome;

    public Categoria(int codCategoria, String nome) {
        this.codCategoria = codCategoria;
        this.nome = nome;
    }

    public void imprimirCategoria() {
        System.out.println("Codigo Categoria: " + this.codCategoria);
        System.out.println("Nome: " + this.nome);
    }

}
