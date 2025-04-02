import java.util.Scanner;

public class Exx2 {
    public static void main(String[] args) {
        int maiorNumero = 0, menorNumero = 99999;
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.println("Digite um número POSITIVO: ");
            numeros[i] = sc.nextInt();

            if(numeros[i] >= 0){
                numeros[i] = numeros[i];
                if(numeros[i] > maiorNumero){
                    maiorNumero = numeros[i];
                }
                else if (numeros[i] < menorNumero) {
                    menorNumero = numeros[i];
                }
            }
            else{
                System.out.println("Inválido, número não é positivo");
            }
        }

        for(int numero : numeros){
            System.out.println(numero);
        }
        System.out.println("Maior > "+maiorNumero);
        System.out.println("Menor > "+menorNumero);

        sc.close();
    }
}
