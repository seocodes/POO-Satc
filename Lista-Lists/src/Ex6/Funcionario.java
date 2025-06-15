package Ex6;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    //sem setSalario() pois o calcularSalario já faz essa lógica


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }
}
