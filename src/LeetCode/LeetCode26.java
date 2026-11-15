
package LeetCode;

// Remove Duplicates from Sorted Array
public class LeetCode26 {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        LeetCode26 leetcode26 = new LeetCode26();

        int[] nums = {1, 1, 2, 2, 3};

        int k = leetcode26.removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
