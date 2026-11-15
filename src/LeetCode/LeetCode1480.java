package LeetCode;

import java.util.Arrays;

public class LeetCode1480 {

    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        LeetCode1480 obj = new LeetCode1480();

        int[] result = obj.runningSum(new int[]{-2, 1, -3, 4, -1, 2});

        System.out.println(Arrays.toString(result));
    }
}