package Ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Número de nomes a ser inserido: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira os nomes: ");
        for(int i=0; i<num; i++){
            nomes.add(sc.nextLine());
        }
        System.out.print("Lista de nomes: ");
        for(String nome : nomes){
            System.out.print(nome + " ");
        }

        System.out.println();
        while (true) {
            System.out.println("Agora escolha um nome para remover:");
            String nomeRemove = sc.nextLine();

            if (nomes.contains(nomeRemove)) {
                nomes.remove(nomeRemove);
                break;
            } else {
                System.out.println("Nome não está na lista. Insira novamente.");
            }
        }
        System.out.print("Lista de nomes atual: ");
        for(String nome : nomes){
            System.out.print(nome + " ");
        }
        sc.close();
    }
}
