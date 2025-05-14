public abstract class Funcionario {
    private long id;
    private String nome;
    private char sexo;
    private int nrHoras;
    private double valorHora;

    public Funcionario(){}

    public Funcionario(long id, String nome, char sexo, int nrHoras, double valorHora){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.nrHoras = nrHoras;
        this.valorHora = valorHora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNrHoras() {
        return nrHoras;
    }

    public void setNrHoras(int nrHoras) {
        this.nrHoras = nrHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString(){
        return "Funcionario: " +
                "\n  ID: " + id +
                "\n  Nome: " + nome +
                "\n  Sexo: " + sexo +
                "\n  Número de Horas: " + nrHoras +
                "\n  Valor por Hora: R$ " + String.format("%.2f", valorHora);
    }

    public String salarioTotal(){
        return "Salário Total: R$ " + String.format("%.2f", nrHoras * valorHora) +
                "\n";
    }
}
