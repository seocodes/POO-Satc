import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Preço produto 1: ");
                double preco1 = sc.nextDouble();
                sc.nextLine();

                System.out.println("Preço produto 2: ");
                double preco2 = sc.nextDouble();
                sc.nextLine();

                System.out.println("Preço produto 3: ");
                double preco3 = sc.nextDouble();

                if((preco1<preco2) && (preco1<preco3) ) {
                    System.out.printf("%.2f é o mais barato, compra.",preco1);
                }
                else if ((preco2<preco1) && (preco2<preco3)){
                    System.out.printf("%.2f é o mais barato, compra.",preco2);
                }
                else{
                    System.out.printf("%.2f é o mais barato, compra.",preco3);
                }
                sc.close();

            }
        }

