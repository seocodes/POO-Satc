public class Engenheiro extends Funcionario{
    private int nrCREA;
    private String especializacao;

    public Engenheiro(){}

    public Engenheiro(long id, String nome, char sexo, int nrHoras, double valorHora, int nrCREA, String especializacao){
        super(id,nome,sexo,nrHoras,valorHora);
        this.nrCREA = nrCREA;
        this.especializacao = especializacao;
    }

    public int getNrCREA() {
        return nrCREA;
    }

    public void setNrCREA(int nrCREA) {
        this.nrCREA = nrCREA;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString(){
        return super.toString()
                + " Número CREA: " + nrCREA
                + "\n Especialização: "+ especializacao +
                "\n";
    }

    @Override
    public String salarioTotal(){
        return "Salário Total: R$" + String.format("%.2f", getNrHoras() * getValorHora()) +
                "\nO funcionário possui uma bonificação de 5%!" +
                "\nSalário total após bonificação: R$" + String.format("%.2f", getNrHoras() * getValorHora() * 1.05);
    }
}
