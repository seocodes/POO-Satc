public abstract class Transporte {
    private String descricao;
    private float tamanho;
    private float peso;

    public Transporte(String descricao, float tamanho, float peso){
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public abstract String exibirDados();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
