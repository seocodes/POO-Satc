import java.util.Scanner;

public class Exx1 {
    public static void main(String[] args) {
        double[] temperaturas = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Digite a temperatura " + i + ":");
            temperaturas[i] = sc.nextDouble();
        }

        for (int i = 0; i<10; i++){
            System.out.println("Temperatura "+i+":"+" "+temperaturas[i]);
        }

        sc.close();
    }
}