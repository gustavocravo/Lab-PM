public class Categoria {
    private int codCategoria;
    private String nomeCategoria;
    private String departamento;

    public Categoria(int codCategoria, String nomeCategoria, String departamento) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
        this.departamento = departamento;
    }

    public void imprimirCategoria() {
        System.out.println("Codigo Categoria: " + this.codCategoria);
        System.out.println("Nome: " + this.nomeCategoria);
        System.out.println("Departamento: " + this.departamento);
    }

}
