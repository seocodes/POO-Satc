import java.util.Date;

//CLASSE PRA ARMAZENAR AS TRANSAÇÕES
public class Transacao {
    private long id;
    private String tipoConta;
    private Date data;
    private double valor;

    public Transacao(long id, String tipoConta, Date data, double valor) {
        this.id = id;
        this.tipoConta = tipoConta;
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transação: " +
                "id=" + id +
                ", tipoConta='" + tipoConta + '\'' +
                ", data=" + data +
                ", valor=" + valor;
    }
}
