import java.util.Date;

public abstract class Clientes {
    private long id;
    private String nome;
    private char sexo;
    private Date data;
    private double saldo;

    public Clientes(){}

    public Clientes(long id, String nome, char sexo, Date data, double saldo){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.data = data;
        this.saldo = saldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void saque(double valor);
    public abstract void deposito(double valor);
}


