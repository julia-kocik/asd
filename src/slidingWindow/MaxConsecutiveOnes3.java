package slidingWindow;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroes = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zeroes++;
            }
            while(zeroes > k) {
                if(nums[left] == 0) {
                    zeroes--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
