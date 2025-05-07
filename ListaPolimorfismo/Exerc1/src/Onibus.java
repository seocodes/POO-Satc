public class Onibus extends Veiculo{
    public final int numRodas = 4;
    public String tipoCategoria;
    public int numPassageiros;

    public Onibus(long id,String marca, String modelo, int ano, String cor, double peso, double tamanho, String tipoCategoria, int numPassageiros){
        super(id,marca,modelo,ano,cor,peso,tamanho);
        this.tipoCategoria = tipoCategoria;
        this.numPassageiros = numPassageiros;
    }

    @Override
    public  void checkList(){
        System.out.println("Revisando o onibus");
    }

    @Override
    public  void adjust(){
        System.out.println("Arrumando o onibus");
    }

    @Override
    public  void cleanup(){
        System.out.println("Limpando o onibus");
    }

    @Override
    public void abastecimento() {
        System.out.println("Abastecendo o onibus");
    }
}

