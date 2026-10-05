package twopointers;

public class MoveZeroes {
    public static void main(String[] args) {

       int[] nums = {0, 1, 0, 3, 12};
       moveZeroes(nums);
       for(int num : nums) {
           System.out.print(num + ", ");
       }

    }

    public static void moveZeroes(int[] nums) {

        // miejsce, gdzie powinien trafić następny element != 0
        int left = 0;

        // right szuka kolejnych elementów != 0
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }
}
