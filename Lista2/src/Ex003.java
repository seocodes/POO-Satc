import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        String passOrFail = (media >= 7.0) ? "PASS" : "FAIL";  //ternary operator, bem massa
        System.out.println(passOrFail);

    }
}
