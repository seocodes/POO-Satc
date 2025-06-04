package Ex4;

public class Cachorro extends AnimalDomestico{
    private String raca;

    public Cachorro(){}

    public Cachorro(String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }

    @Override
    public void alimentacao(){
        System.out.printf("O CACHORRO %s %s está comendo!\n",getRaca(),getNome());
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cachorro{");
        sb.append(super.toString());
        sb.append(", raca='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
