import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("CADASTRO FUNCIONÁRIO: " +
                    "\n 1 - ENGENHEIRO" +
                    "\n 2 - DIRETOR" +
                    "\n 3 - SECRETÁRIO" +
                    "\n 4 - GERENTE" +
                    "\n 5 - LISTAR FUNCIONÁRIOS" +
                    "\n 6 - SAIR");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 5) {
                mostrarFuncionarios(funcionarios);
            } else if (op == 6) {
                break;
            } else if (op >= 1 && op <= 4) {
                funcionarios.add(criarFuncionario(sc, op));
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
        sc.close();
    }

    public static void mostrarFuncionarios(ArrayList<Funcionario> funcionarios){
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Salário Total: " + funcionario.salarioTotal());
            System.out.println("----------------------------");
        }
    }

    public static Funcionario criarFuncionario(Scanner sc, int op) {
        System.out.print("Código do funcionário: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Número de horas trabalhadas: ");
        int nrHoras = sc.nextInt();
        sc.nextLine();
        System.out.print("Valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();
        sc.nextLine();

        switch (op) {
            case 1:
                System.out.print("CREA: ");
                int crea = sc.nextInt();
                sc.nextLine();
                System.out.print("Especialização: ");
                String esp = sc.nextLine();
                return new Engenheiro(id, nome, sexo, nrHoras, valorHora, crea, esp);
            case 2:
                System.out.print("Área de gestão: ");
                String areaGestao = sc.nextLine();
                return new Diretor(id, nome, sexo, nrHoras, valorHora, areaGestao);

            case 3:
                System.out.print("Categoria: ");
                String categoria = sc.nextLine();
                System.out.print("Setor: ");
                String setorSec = sc.nextLine();
                return new Secretario(id, nome, sexo, nrHoras, valorHora, categoria, setorSec);

            case 4:
                System.out.print("Setor: ");
                String setor = sc.nextLine();
                return new Gerente(id, nome, sexo, nrHoras, valorHora, setor);

            default:
                return null;
        }
    }
}

