package Ex6;

public class Gerente extends Funcionario{
    public Gerente() { super(); }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario(){
        return getSalario();
    }

    @Override
    public String toString() {
        return "Gerente: " + super.toString();
    }
}
