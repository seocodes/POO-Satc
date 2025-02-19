import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        double valorComAumento = (salario*0.5)+salario;

        System.out.printf("%s, seu salário era %.2f, e após o aumento está em: %.2f",nome,salario,valorComAumento);

        sc.close();
    }
}
