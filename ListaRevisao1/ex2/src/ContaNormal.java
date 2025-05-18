import java.util.Date;

public class ContaNormal extends Clientes{
    public ContaNormal(){}

    public ContaNormal(long id, String nome, char sexo, Date data, double saldo){
        super(id,nome,sexo,data,saldo);
    }

    @Override
    public void saque(double valor){
        System.out.println("SAQUE CONTA NORMAL!");
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo atual: "+getSaldo());
    }

    public void deposito(double valor){
        System.out.println("DEPÓSITO CONTA NORMAL!");
        setSaldo(getSaldo() + valor - (getSaldo()*0.02));
        System.out.println("Saldo atual: "+getSaldo());
    }

    @Override
    public String toString() {
        return "Conta Normal: " +
                "ID: " + getId() +
                ", Nome: " + getNome() +
                ", Sexo: " + getSexo() +
                ", Data de criação: " + getData() +
                ", Saldo: " + getSaldo();
    }
}
