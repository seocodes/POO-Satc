import java.util.Date;

public class ContaEspecial extends Clientes{
    public ContaEspecial(){}

    public ContaEspecial(long id, String nome, char sexo, Date data, double saldo){
        super(id,nome,sexo,data,saldo);
    }

    @Override
    public void saque(double valor){
        System.out.println("SAQUE CONTA ESPECIAL");
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo atual: "+getSaldo());
    }

    public void deposito(double valor){
        System.out.println("DEPÓSITO CONTA ESPECIAL - SEM TAXAS PARA DEPÓSITO!");
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: "+getSaldo());
    }

    @Override
    public String toString() {
        return "Conta Especial: " +
                "ID: " + getId() +
                ", Nome: " + getNome() +
                ", Sexo: " + getSexo() +
                ", Data de criação: " + getData() +
                ", Saldo: " + getSaldo();
    }
}
