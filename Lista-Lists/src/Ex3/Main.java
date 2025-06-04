package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean temBanana = false;

        System.out.println("Digite as 5 frutas: ");
        for(int i = 0; i<5; i++){
            frutas.add(sc.nextLine());
        }

        for(String fruta : frutas){
            if (fruta.equalsIgnoreCase("banana")){
                temBanana = true;
            }
        }

        if(!temBanana){
            System.out.println("Não achamo a banana p comer mano");
        }
        else{
            System.out.println("TEM BANANA VAMOOO");
        }

        sc.close();
    }
}
