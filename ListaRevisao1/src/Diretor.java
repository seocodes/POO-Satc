public class Diretor extends Funcionario {
    private String areaGestao;

    public Diretor() {}

    public Diretor(long id, String nome, char sexo, int nrHoras, double valorHora, String areaGestao) {
        super(id, nome, sexo, nrHoras, valorHora);
        this.areaGestao = areaGestao;
    }

    public String getAreaGestao() {
        return areaGestao;
    }

    public void setAreaGestao(String areaGestao) {
        this.areaGestao = areaGestao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  Área de Gestão: " + areaGestao +
                "\n";
    }

    @Override
    public String salarioTotal(){
        return "Salário Total: R$" + String.format("%.2f", getNrHoras() * getValorHora()) +
                "\nO funcionário possui uma bonificação de 2%!" +
                "\nSalário total após bonificação: R$" + String.format("%.2f", getNrHoras() * getValorHora() * 1.02);
    }
}
