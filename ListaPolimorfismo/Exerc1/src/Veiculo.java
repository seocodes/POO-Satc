public abstract class Veiculo {
    public long id;
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double peso;
    public double tamanho;

    public Veiculo(long id, String marca, String modelo, int ano, String cor, double peso, double tamanho) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public abstract void checkList();
    public abstract void adjust();
    public abstract void cleanup();
    public abstract void abastecimento();
}
