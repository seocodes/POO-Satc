import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura em metros: ");
        double altura = sc.nextDouble();

        double IMC = peso/(Math.pow(altura,2));

        System.out.printf("%s, seu IMC é: %.2f",nome,IMC);

        sc.close();
    }
}
