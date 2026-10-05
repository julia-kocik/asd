package secondSmallest;

public class Main {
    public static void main(String[] args) {
        int[] A = {5, 1, 7, 2, 1, 9};

        System.out.println(secondSmallest(A));
    }

    public static int secondSmallest(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int second = arr[0];
        boolean found = false;

//        int j = 0;
//        while(second == min) {
//            j++;
//            second = arr[j];
//        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > min) {
                if(!found || arr[i] < second) {
                    second = arr[i];
                    found = true;
                }
            }
        }
        return second;
    }
}
