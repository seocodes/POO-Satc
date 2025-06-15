package Ex6;

public class Vendedor extends Funcionario{
    private double comissao;
    public Vendedor() { super(); }

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return getSalario() + comissao;
    }

    @Override
    public String toString() {
        return "Vendedor: " + super.toString();
    }
}
