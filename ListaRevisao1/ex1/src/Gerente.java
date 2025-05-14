public class Gerente extends Funcionario {
    private String setor;

    public Gerente() {}

    public Gerente(long id, String nome, char sexo, int nrHoras, double valorHora, String setor) {
        super(id, nome, sexo, nrHoras, valorHora);
        this.setor = setor;
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
                "  Setor: " + setor +
                "\n";
    }

    @Override
    public String salarioTotal(){
        return "Salário Total: R$" + String.format("%.2f", getNrHoras() * getValorHora()) +
                "\nO funcionário possui uma bonificação de 2%!" +
                "\nSalário total após bonificação: R$" + String.format("%.2f", getNrHoras() * getValorHora() * 1.02);
    }
}

