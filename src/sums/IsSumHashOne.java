package sums;

import java.util.HashSet;

public class IsSumHashOne {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(isAnySum(A));
        System.out.println(isEverySum(A));
    }

    public static boolean isAnySum(int[] arr) {

        for (int k = 0; k < arr.length; k++) {

            HashSet<Integer> seen = new HashSet<>();

            for (int i = 0; i < arr.length; i++) {

                if (i == k) {
                    continue;
                }

                int needed = arr[k] - arr[i];

                if (seen.contains(needed)) {
                    return true;
                }

                seen.add(arr[i]);
            }
        }

        return false;
    }

    public static boolean isEverySum(int[] arr) {

        for (int k = 0; k < arr.length; k++) {

            HashSet<Integer> seen = new HashSet<>();
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (i == k) {
                    continue;
                }

                int needed = arr[k] - arr[i];

                if (seen.contains(needed)) {
                    found = true;
                    break;
                }

                seen.add(arr[i]);
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
