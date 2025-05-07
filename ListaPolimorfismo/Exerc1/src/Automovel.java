public class Automovel extends Veiculo{
    public final int numRodas = 4;
    public String tipoCategoria;

    public Automovel(long id,String marca, String modelo, int ano, String cor, double peso, double tamanho, String tipoCategoria){
        super(id,marca,modelo,ano,cor,peso,tamanho);
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public  void checkList(){
        System.out.println("Revisando o automovel");
    }

    @Override
    public  void adjust(){
        System.out.println("Arrumando o automovel");
    }

    @Override
    public  void cleanup(){
        System.out.println("Limpando o automovel");
    }

    @Override
    public void abastecimento() {
        System.out.println("Abastecendo o automovel");
    }
}


