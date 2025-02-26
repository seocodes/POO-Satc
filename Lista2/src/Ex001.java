import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        if(num1>num2) {
            System.out.printf("%.2f é o maior número",num1);
        }
        else{
            System.out.printf("%.2f é o maior número",num2);
        }
         sc.close();

    }
}