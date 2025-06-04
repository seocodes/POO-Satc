package Ex4;

public abstract class AnimalDomestico {
    private String nome;
    private int idade;

    public AnimalDomestico(){}

    public AnimalDomestico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void alimentacao(){System.out.println("O animal está comendo...");};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade='").append(idade).append('\'');
        return sb.toString();
    }
}
