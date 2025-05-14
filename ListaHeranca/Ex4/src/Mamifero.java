public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia, String alimento){
        super(nome, comprimento, numPatas, cor, ambiente, velocMedia);
        this.alimento = alimento;
    }

    @Override
    public String exibirDados(){
        return "Mamifero " +
                super.exibirDados() +
                "\n  Alimentação: " + alimento +
                "\n";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

