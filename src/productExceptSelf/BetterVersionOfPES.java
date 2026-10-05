package productExceptSelf;

public class BetterVersionOfPES {

        public static int[] productExceptSelf(int[] nums) {
            int[] answer = new int[nums.length];

            int productLeft = 1;

            for(int i = 0; i < nums.length; i++) {
                answer[i] = productLeft;
                productLeft *= nums[i];
            }

            int productRight = 1;

            for(int i = nums.length - 1; i >= 0; i--) {
                answer[i] *= productRight;
                productRight *= nums[i];
            }
            return answer;

    }
}
