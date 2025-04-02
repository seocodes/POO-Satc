import java.util.ArrayList;
import java.util.Scanner;

public class Exx4 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite um valor: ");
            valores[i] = sc.nextInt();
            if(valores[i]%2 == 0){
                pares.add(valores[i]);
            }
            else{
                impares.add(valores[i]);
            }
        }

        System.out.println("Existem "+pares.size()+" números pares, que são:");
        for(int numero : pares){
            System.out.println(numero);
        }

        System.out.println("Existem "+impares.size()+" números impares, que são:");
        for(int numero : impares) {
            System.out.println(numero);
        }
    }
}
