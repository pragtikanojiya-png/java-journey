package LeetCode;

public class leetCode189 {

        public void rotate(int[] nums, int k) {

            int n = nums.length;
            k = k % n;

            // Store last k elements
            int[] temp = new int[k];

            for (int i = 0; i < k; i++) {
                temp[i] = nums[n - k + i];
            }

            // Shift remaining elements to right
            for (int i = n - k - 1; i >= 0; i--) {
                nums[i + k] = nums[i];
            }

            // Copy temporary elements to beginning
            for (int i = 0; i < k; i++) {
                nums[i] = temp[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }
        public static void main(String[] args) {
            leetCode189 obj = new leetCode189();
            int[] arr={ 1 ,2 ,3 ,4 ,5, 6, 7};
            int k=3;
            obj.rotate( arr, k);
    }
}
