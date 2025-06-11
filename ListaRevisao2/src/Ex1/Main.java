package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Bote os 10 numeros:");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Soma de todos os números:");
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        System.out.println(sum);
        sc.close();
    }
}
