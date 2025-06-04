package Ex4;

public class Gato extends AnimalDomestico{
    private String raca;

    public Gato(){}

    public Gato(String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }

    @Override
    public void alimentacao(){
        System.out.printf("O GATO %s %s está comendo!\n",getRaca(),getNome());    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato{");
        sb.append(super.toString());
        sb.append(", raca='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
