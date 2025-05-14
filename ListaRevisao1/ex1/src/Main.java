import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            Funcionario funcionario = null;
            System.out.println("CADASTRO FUNCIONÁRIO: " +
                    "\n 1 - ENGENHEIRO" +
                    "\n 2 - DIRETOR" +
                    "\n 3 - SECRETÁRIO" +
                    "\n 4 - GERENTE" +
                    "\n 5 - LISTAR FUNCIONÁRIOS" +
                    "\n 6 - SAIR");

            int op = sc.nextInt();
            sc.nextLine();

            //Colquei os casos 5 e 6 em IF pra separar as responsabilidades
            //Switch-case ficou só pra cadastro!
            if (op == 5) {
                System.out.println("\nLista de Funcionários:");
                for (Funcionario f : funcionarios) {
                    System.out.println(f);
                    System.out.println(f.salarioTotal());
                    System.out.println("----------------------------");
                }
                continue;
            }

            if (op == 6) {
                break;
            }

            //Melhor para pegar os dados em comuns (da classe Funcionário) - reusabilidade
            //Precisa desse if, pois se estiver solto vai pedir as informações mesmo se o user só pedir para listar funcionários
            if (op >= 1 && op <= 4) {
                long id;
                String nome;
                char sexo;
                int nrHoras;
                double valorHora;

                System.out.print("Código do funcionário: ");
                id = sc.nextLong();
                sc.nextLine();
                System.out.print("Nome do funcionário: ");
                nome = sc.nextLine();
                System.out.print("Sexo: ");
                sexo = sc.next().charAt(0);
                System.out.print("Número de horas trabalhadas: ");
                nrHoras = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor da hora trabalhada: ");
                valorHora = sc.nextDouble();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("CREA: ");
                        int crea = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Especialização: ");
                        String esp = sc.nextLine();
                        funcionario = new Engenheiro(id, nome, sexo, nrHoras, valorHora, crea, esp);
                        break;
                    case 2:
                        System.out.print("Área de gestão: ");
                        String areaGestao = sc.nextLine();
                        funcionario = new Diretor(id, nome, sexo, nrHoras, valorHora, areaGestao);
                        break;
                    case 3:
                        System.out.print("Categoria: ");
                        String categoria = sc.nextLine();
                        System.out.print("Setor: ");
                        String setorSec = sc.nextLine();
                        funcionario = new Secretario(id, nome, sexo, nrHoras, valorHora, categoria, setorSec);
                        break;
                    case 4:
                        System.out.print("Setor: ");
                        String setor = sc.nextLine();
                        funcionario = new Gerente(id, nome, sexo, nrHoras, valorHora, setor);
                        break;
                }
                funcionarios.add(funcionario);
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}

