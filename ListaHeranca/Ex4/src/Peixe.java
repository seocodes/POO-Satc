public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia, String caracteristica){
        super(nome, comprimento, numPatas, cor, ambiente, velocMedia);
        this.caracteristica = caracteristica;
    }

    @Override
    public String exibirDados(){
        return "Peixe " +
                super.exibirDados() +
                "\n  Característica especial: " + caracteristica +
                "\n";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
