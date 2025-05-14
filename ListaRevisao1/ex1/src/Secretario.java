public class Secretario extends Funcionario {
    private String categoria;
    private String setor;

    public Secretario() {}

    public Secretario(long id, String nome, char sexo, int nrHoras, double valorHora, String categoria, String setor) {
        super(id, nome, sexo, nrHoras, valorHora);
        this.categoria = categoria;
        this.setor = setor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  Categoria: " + categoria +
                "\n  Setor: " + setor +
                "\n";
    }

    @Override
    public String salarioTotal(){
        return "Salário Total: R$" + String.format("%.2f", getNrHoras() * getValorHora()) +
                "\nO funcionário possui uma bonificação de 5%!" +
                "\nSalário total após bonificação: R$" + String.format("%.2f", getNrHoras() * getValorHora() * 1.05);
    }
}