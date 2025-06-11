package Ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("0 - SAIR\n" +
                    "1 - ADICIONAR NOME");
            op = sc.nextInt();

            if(op == 1){
                sc.nextLine();
                nomes.add(sc.nextLine());
            }
        }while (op != 0);

        System.out.print("Nomes cadastados: ");
        for(String nome : nomes){
            System.out.print(nome + " ");
        }
    }
}
