package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] nums = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Bota as 5 notas:");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        double sum = 0;

        for(double num : nums){
            sum+=num;
        }

        double media = sum/nums.length;
        System.out.println("Média: "+media);

        System.out.println("Além disso, suas notas acima da média foram: ");
        for(double num : nums){
            if(num >= 7.0){
                System.out.print(num+" ");
            }
        }
        sc.close();
    }
}
