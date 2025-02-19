import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Produto: ");
        String produto = sc.nextLine();

        System.out.print("Quant: ");
        int quant = sc.nextInt();
        sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        double valor = preco*quant;

        System.out.printf("%s, %d %s(s) de %.2f irão custar %.2f",nome,quant,produto,preco,valor);

        sc.close();

    }

}
