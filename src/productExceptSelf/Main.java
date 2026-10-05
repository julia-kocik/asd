package productExceptSelf;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
//        for(int i: productExceptSelf(nums)) {
//            System.out.print(i + ", ");
//        }

        int[] result = BetterVersionOfPES.productExceptSelf(nums);
       for(int e: result) {
           System.out.print(e+ ", ");
       }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int[] reducedArr = removeElement(nums, i);
            answer[i] = multiplyArrELements(reducedArr);
        }
        return answer;
    }

    public static int multiplyArrELements(int[] arr) {
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
