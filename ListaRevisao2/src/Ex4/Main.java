package Ex4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();

        for(int i=0; i< nums.length; i++){
            nums[i]= random.nextInt(100);
        }

        for(int num : nums){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Numeros pares:");
        for(int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
