public class Bicicleta extends Veiculo{
    public final int numRodas = 2;
    public String tipoCategoria;

    public Bicicleta(long id,String marca, String modelo, int ano, String cor, double peso, double tamanho, String tipoCategoria){
        super(id,marca,modelo,ano,cor,peso,tamanho);
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public  void checkList(){
        System.out.println("Revisando a bike");
    }

    @Override
    public  void adjust(){
        System.out.println("Fazneod manutenção na bike");
    }

    @Override
    public  void cleanup(){
        System.out.println("Limpando bike");
    }

    @Override
    public void abastecimento() {
        System.out.println("Não tem como abastecer");
    }
}
