import java.util.Scanner;

public class Exx3 {
    static int contPos = 0, contNeg = 0;
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
            verificarNumero(numeros[i]);
        }
        System.out.println("Números positivos: "+contPos+"\nNúmeros negativos: "+contNeg);
    }

    public static void verificarNumero(int num){
        if(num >= 0){
            contPos++;
        }
        else{
            contNeg++;
        }
    }
}
