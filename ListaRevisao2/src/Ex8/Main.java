package Ex8;

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

        boolean sair = false;
        do{
            System.out.println("0 - Sair"+"\n 1 - Pesquisar número");
            int op = sc.nextInt();
            if(op == 0){
                sair = true;
            }
            else if(op == 1){
                System.out.print("Número a pesquisar: ");
                int numPesquisar = sc.nextInt();
                if(numeros.contains(numPesquisar)){
                    System.out.println(numPesquisar +" existe e está na posição " + numeros.indexOf(numPesquisar));
                }
                else{
                    System.out.println("Número não encontrado no array");
                }
            }
            else{
                System.out.println("Opção inválida...");
            }
        }while(!sair);

        sc.close();
    }
}
