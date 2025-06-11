package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Bote os 10 numeros:");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        //pode ser maior/menor = nums[0], mas é pra caso
        //o array nao tenha numero, isso garante que as vars recebam um valor ao menos
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int num : nums){
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }

        System.out.println("Maior: "+maior+"\nMenor: "+menor);
    }
}
