package LeetCode;

public class LeetCode53{

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        LeetCode53 leetCode53 = new LeetCode53();
        System.out.println(leetCode53.maxSubArray(new int[]{-2,1,-3,4,-1,2}));

    }
}

