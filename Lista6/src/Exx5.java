import java.util.Scanner;

public class Exx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vao ter no array: ");
        int qtd = sc.nextInt();
        int[] numeros = new int[qtd];

        for(int i=0; i<numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("O maior número é: "+retornarMaior(numeros));
        sc.close();
    }

    public static int retornarMaior(int[] num) {
        int maiorNumero = 0;
        for (int numero : num) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }
}
