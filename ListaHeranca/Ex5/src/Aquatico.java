public class Aquatico extends Transporte{
    private float altura;

    public Aquatico(String descricao, float tamanho, float peso, float altura){
        super(descricao, tamanho, peso);
        this.altura = altura;
    }

    @Override
    public String exibirDados(){
        return "";
    }
}
