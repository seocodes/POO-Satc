package Ex5;

public class Carro extends Veiculo{
    public Carro() { super(); }

    public Carro(double velocidade) { super(velocidade); }

    @Override
    // Mesmo que a variável velocidade esteja privada, o metodo getVelocidade()
    // tem acesso à memória interna da instância, porque ele foi definido na
    // mesma classe onde velocidade foi declarada. Por isso é possível usar o getVelocidade().
    public void mostrarVelocidade(){
        System.out.println("A velocidade do CARRO é: "+getVelocidade());
    }
}
