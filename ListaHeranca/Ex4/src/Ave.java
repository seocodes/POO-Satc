public class Ave extends Animal{
    private String tipoBico;

    public Ave(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia, String tipoBico){
        super(nome, comprimento, numPatas, cor, ambiente, velocMedia);
        this.tipoBico = tipoBico;
    }

    @Override
    public String exibirDados(){
        return "Ave " +
                "\n  Nome: " + getNome() +
                "\n  Comprimento: " + getComprimento() + " cm" +
                "\n  Número de patas: " + getNumPatas() +
                "\n  Cor: " + getCor() +
                "\n  Ambiente: " + getAmbiente() +
                "\n  Velocidade média: " + getVelocMedia() + " km/h " +
                "\n  Alimentação: " + tipoBico +
                "\n";
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }
}
