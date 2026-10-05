package sums;

import java.util.HashSet;

public class IsSumHashTwo {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7};
        int[] arr2 = {1, 2, 3, 4};


        System.out.println(isAnySum(arr1, arr2));
        System.out.println(isEverySum(arr1, arr2));
    }

    public static boolean isAnySum(int[] arr1, int[] arr2) {

        for (int target : arr1) {

            HashSet<Integer> seen = new HashSet<>();

            for (int num : arr2) {

                int needed = target - num;

                if (seen.contains(needed)) {
                    return true;
                }

                seen.add(num);
            }
        }

        return false;
    }

    public static boolean isEverySum(int[] arr1, int[] arr2) {

        for (int target : arr1) {

            HashSet<Integer> seen = new HashSet<>();
            boolean found = false;

            for (int num : arr2) {

                int needed = target - num;

                if (seen.contains(needed)) {
                    found = true;
                    break;
                }

                seen.add(num);
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
