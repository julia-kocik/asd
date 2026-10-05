package slidingWindow;

public class MaxAvgSubArr {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum+=nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum -= nums[i - k];
            windowSum += nums[i];
            maxSum = Math.max(windowSum, maxSum);
        }

        return (double) maxSum/k;

    }
}
