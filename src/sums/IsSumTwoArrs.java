package sums;

public class IsSumTwoArrs {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 111};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(checkSums(arr1, arr2));
        System.out.println(isAnySum(arr1, arr2));
    }

    public static boolean isAnySum(int[] arr1, int[] arr2) {
        for(int num: arr1) {
            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if(arr2[i] + arr2[j] == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkSums(int[] arr1, int[] arr2) {
        for (int num : arr1) {
            boolean found = false;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] + arr2[j] == num) {
                        found = true;
                        break;
                    }

                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

}
