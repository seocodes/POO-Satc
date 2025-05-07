public class Caminhao extends Veiculo{
    public final int numRodas = 4;
    public String tipoCategoria;
    public double pesoCarga;

    public Caminhao(long id,String marca, String modelo, int ano, String cor, double peso, double tamanho, String tipoCategoria, double pesoCarga){
        super(id,marca,modelo,ano,cor,peso,tamanho);
        this.tipoCategoria = tipoCategoria;
        this.pesoCarga = pesoCarga;
    }

    @Override
    public  void checkList(){
        System.out.println("Revisando o caminhao");
    }

    @Override
    public  void adjust(){
        System.out.println("Arrumando o caminhao");
    }

    @Override
    public  void cleanup(){
        System.out.println("Limpando o caminhao");
    }

    @Override
    public void abastecimento() {
        System.out.println("Abastecendo o caminhao");
    }
}
