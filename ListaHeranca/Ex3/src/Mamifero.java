public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia, String alimento){
        super(nome, comprimento, numPatas, cor, ambiente, velocMedia);
        this.alimento = alimento;
    }


    public String dadosMamifero(){  //fiz String mesmo pq é mais legal doq void com sout
        return "Mamifero " +
                "\n  Nome: " + getNome() +
                "\n  Comprimento: " + getComprimento() + " cm" +
                "\n  Número de patas: " + getNumPatas() +
                "\n  Cor: " + getCor() +
                "\n  Ambiente: " + getAmbiente() +
                "\n  Velocidade média: " + getVelocMedia() + " km/h " +
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
