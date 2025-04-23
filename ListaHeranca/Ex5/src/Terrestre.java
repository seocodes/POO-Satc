public class Terrestre extends Transporte{
    private int numRodas;

    public Terrestre(String descricao, float tamanho, float peso, int numRodas){
        super(descricao,tamanho,peso);
        this.numRodas = numRodas;
    }

    @Override
    public String exibirDados(){
        return "";
    }
}
