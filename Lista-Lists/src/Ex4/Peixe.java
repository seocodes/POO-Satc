package Ex4;

public class Peixe extends AnimalDomestico{
    private String tipo;

    public Peixe(){}

    public Peixe(String nome, int idade, String tipo){
        super(nome,idade);
        this.tipo = tipo;
    }

    @Override
    public void alimentacao(){
        System.out.printf("O PEIXE %s %s está comendo!\n",getTipo(),getNome());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peixe{");
        sb.append(super.toString());
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
