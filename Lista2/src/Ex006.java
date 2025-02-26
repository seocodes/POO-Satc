import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipoCombustivel = sc.next().charAt(0); //char at 0 pra caso o cara escreva "Alcool" etc.

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        double valorPago = 0; //declarei aq pq o print ta fora dos if

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorPago = litros * precoAlcool * 0.97;
            } else {
                valorPago = litros * precoAlcool * 0.95;
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorPago = litros * precoGasolina * 0.96;
            } else {
                valorPago = litros * precoGasolina * 0.94;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }


        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorPago);


        sc.close();
    }
}
