public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia, String caracteristica){
        // Melhor utilizar super() para chamar o construtor da superclasse diretamente,
        // em vez de usar métodos set herdados como setNome(nome), setComprimento(comprimento), etc.
        super(nome, comprimento, numPatas, cor, ambiente, velocMedia);
        this.caracteristica = caracteristica;
    }


    public String dadosPeixe(){
        //usa o metodo get pois lá no Animal é PRIVATE
        return "Peixe " +
                "\n  Nome: " + getNome() +
                "\n  Comprimento: " + getComprimento() + " cm" +
                "\n  Número de patas: " + getNumPatas() +
                "\n  Cor: " + getCor() +
                "\n  Ambiente: " + getAmbiente() +
                "\n  Velocidade média: " + getVelocMedia() + " km/h " +
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
