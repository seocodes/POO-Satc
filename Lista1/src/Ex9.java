import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço de fábrica: ");
        double preco = sc.nextDouble();

        double porcDistribuidor = 0.2;
        double impostos = 0.35;

        double valorFinal = (preco)+preco*porcDistribuidor+preco*impostos;

        System.out.println(valorFinal);

        sc.close();
    }
}
