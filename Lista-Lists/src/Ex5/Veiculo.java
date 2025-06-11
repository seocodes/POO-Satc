package Ex5;

public abstract class Veiculo {
    private double velocidade;

    public Veiculo(){}

    public Veiculo(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void mostrarVelocidade(){
        System.out.println("A velocidade do veículo é: "+velocidade);
    }
}
