package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.printf("Digite a %da cor: ",i+1);
            cores.add(sc.nextLine());
        }

        System.out.println("Lista cores:");
        for(String cor : cores){
            System.out.println(cor);
        }

        sc.close();
    }
}