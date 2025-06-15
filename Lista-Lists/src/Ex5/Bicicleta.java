package Ex5;

public class Bicicleta extends Veiculo{
    public Bicicleta() { super(); }

    public Bicicleta(double velocidade) { super(velocidade); }

    @Override
    public void mostrarVelocidade(){
        System.out.println("A velocidade da BICICLETA é: "+getVelocidade());
    }
}
