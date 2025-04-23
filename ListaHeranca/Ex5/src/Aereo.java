public class Aereo extends Transporte{
    private int numPassageiros;

    public Aereo(String descricao, float tamanho, float peso, int numPassageiros){
        super(descricao,tamanho,peso);
        this.numPassageiros = numPassageiros;
    }
    @Override
    public String exibirDados(){
        return "";
    }
}
