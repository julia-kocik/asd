package twopointers;

import java.util.Arrays;

public class MaxnumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        int[] nums2 = {3,1,3,4,3};
        int j = 6;
        System.out.println(maxOperations(nums, k));
        System.out.println(maxOperations(nums2, j));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                left++;
                right--;
                count++;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
