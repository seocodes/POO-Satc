package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] inverted = new int[nums.length];
        Scanner sc = new Scanner(System.in);

        System.out.println("Bota os 5 numero:");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        for (int i=0; i<nums.length; i++){
            inverted[nums.length-1-i] = nums[i];
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int num : inverted){
            System.out.print(num + " ");
        }

    }
}
