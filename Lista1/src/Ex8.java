import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Numero de horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        double salarioBruto = valor*horas*30;
        double liquido = (salarioBruto)-salarioBruto*0.02;

        System.out.printf("%s, seu salário bruto é de %.2f, o líquido é: %.2f",nome,salarioBruto,liquido);

        sc.close();
    }
}
