import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList<Transacao> transacoes = new ArrayList<>();
    static ArrayList<Clientes> clientes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            exibirMenu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 0:
                    System.out.println("Encerrando a sessão...");
                case 1,2,3:
                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Sexo (M/F): ");
                    char sexo = sc.nextLine().charAt(0);

                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();

                    Date dataAtual = new Date();
                    Clientes cliente = criarCliente(id,nome,sexo,dataAtual,saldo,op);
                    clientes.add(cliente);
                    break;
                case 4:
                    for(Clientes c : clientes){
                        System.out.println(c);
                    }
                    break;
                case 5:
                    for(Transacao transacao : transacoes){
                        System.out.println(transacao);
                    }
                    break;
                case 6:
                    System.out.print("Digite o ID da conta a ser acessada: ");
                    long idBusca = sc.nextLong();
                    Clientes cli = buscarClientePorId(idBusca);
                    if (cli!= null) {
                        menuOperacoes(cli, sc);
                    } else {
                        System.out.println("❌ Conta com ID " + idBusca + " não encontrada.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 0);
    }

    public static Clientes criarCliente(long id, String nome, char sexo, Date data, double saldo, int op){
        return switch (op) {
            case 1 -> new ContaNormal(id, nome, sexo, data, saldo);
            case 2 -> new ContaPoupanca(id, nome, sexo, data, saldo);
            case 3 -> new ContaEspecial(id, nome, sexo, data, saldo);
            default -> null;
        };
    }
    public static void adicionarTransacoes(long id, String tipoConta, Date data, double valor){
        Transacao transacao = new Transacao(id,tipoConta,data,valor);
        transacoes.add(transacao);
    }
    public static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Criar Conta Normal");
        System.out.println("2. Criar Conta Poupança");
        System.out.println("3. Criar Conta Especial");
        System.out.println("4. Listar Contas");
        System.out.println("5. Listar Transações");
        System.out.println("6. Acessar Conta Existente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    public static Clientes buscarClientePorId(long id) {
        for (Clientes c : clientes) {
            if (c.getId() == id) {
                return c;  //retorna o cliente com aquele ID
            }
        }
        return null;
    }
    public static void menuOperacoes(Clientes cliente, Scanner sc) {
        int op;
        do {
            System.out.println("\n=== OPERAÇÕES PARA " + cliente.getNome() + " ===");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("Valor para depósito: ");
                    double valor = sc.nextDouble();
                    cliente.deposito(valor);
                    adicionarTransacoes(cliente.getId(), cliente.getClass().getSimpleName(), new Date(), valor);
                    //OBS: cliente.getClass().getSimpleName() printa o nome do tipo da conta certinho
                }
                case 2 -> {
                    System.out.print("Valor para saque: ");
                    double valor = sc.nextDouble();
                    cliente.saque(valor);
                    adicionarTransacoes(cliente.getId(), cliente.getClass().getSimpleName(), new Date(), -valor);
                }
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
