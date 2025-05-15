import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,1,2};

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
