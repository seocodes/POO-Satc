package Ex6;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int op;
        do{
            showMenu();
            op = sc.nextInt();
            sc.nextLine();

            if(op == 0){
                System.out.println("Saindo do programa...");
            }

            else if(op == 1 || op == 2){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                funcionarios.add(cadastrarFuncionario(nome, salario, op, sc));
            }

            else if(op == 3){
                for(Funcionario funcionario : funcionarios){
                    System.out.println(funcionario);
                }
            }

            else{
                System.out.println("Opção inválida");
            }
        }while(op != 0);

        sc.close();
    }

    public static void showMenu(){
        System.out.println();
        System.out.println("0 - SAIR\n" +
                "1 - CADASTRAR VENDEDOR\n"+
                "2 - CADASTRAR GERENTE\n"+
                "3 - LISTAR FUNCIONÁRIOS");
    }

    public static Funcionario cadastrarFuncionario(String nome, double salario, int op, Scanner sc){
        return switch(op){
            case 1 -> {
                System.out.print("Comissão do vendedor: ");
                double comissao = sc.nextDouble();
                yield new Vendedor(nome,salario, comissao);
            }
            case 2 -> new Gerente(nome,salario);
            default -> throw new IllegalArgumentException("Opção inválida: " + op);
        };
    }
}
