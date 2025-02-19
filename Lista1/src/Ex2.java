import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Disciplina: ");
        String disc = sc.nextLine();

        System.out.print("N1: ");
        double n1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("N2: ");
        double n2 = sc.nextDouble();
        sc.nextLine();


        System.out.print("N3: ");
        double n3 = sc.nextDouble();
        sc.nextLine();

        double media = (n1+n2+n3)/3;

        System.out.printf("%s, sua média é: %.2f",nome,media);
    }
}
