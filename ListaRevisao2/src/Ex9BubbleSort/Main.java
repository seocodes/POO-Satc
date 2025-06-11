package Ex9BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Número de numeros a ser inserido: ");
        int num = sc.nextInt();

        System.out.println("Insira os numeros: ");
        for(int i=0; i<num; i++){
            numeros.add(sc.nextInt());
        }

        //o numeros.size() - 1 é pq é como se não começasse pelo zero
        //ai ia dar problema de indexOutOfBounds
        for(int i=0; i<numeros.size() - 1; i++){
            for(int j = 0; j<numeros.size() - 1; j++){
                if(numeros.get(j) > numeros.get(j + 1)){
                    int temp = numeros.get(j);
                    //manda o menor p esquerda
                    numeros.set(j, numeros.get(j + 1));
                    //manda o numero maior pra direita
                    numeros.set(j + 1, temp);
                }
            }
        }
        for(int number : numeros){
            System.out.print(number + " ");
        }

        sc.close();
    }
}
