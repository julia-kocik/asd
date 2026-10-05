package sums;

public class IsSum {
        public static void main(String[] args) {
            int[] A = {1, 2, 3};
            System.out.println(isAnySum(A));
            System.out.println(isEverySum(A));
        }

        public static boolean isAnySum(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = j+1; k < arr.length; k++) {
                        if( i != k && j != k && arr[i] == arr[j] + arr[k]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public static boolean isEverySum(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                boolean found = false;
                for (int j = 0; j < arr.length; j++) {
                    for (int k = j+1; k < arr.length; k++) {
                        if( i != k && j != k && arr[i] == arr[j] + arr[k]) {
                            found = true;
                            break;
                        }
                    }
                    if(found) {
                        break;
                    }
                }
                if(!found) {
                    return false;
                }
            }
            return true;

        }


}
