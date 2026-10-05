package jumpSearch;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int x = 5;
        System.out.println(jumpSearch(A,x));
    }

    public static int jumpSearch(int[] arr, int key) {
     int i = 0;
     int k = (int) Math.sqrt(arr.length);
     while(i < arr.length && arr[Math.min(i+k, arr.length) - 1] < key) {
        i+=k;
     }

        for (int j = 0; j < Math.min(j+k, arr.length) - 1; j++) {
            if(arr[j] == key) {
                return j;
            }
        }
        return -1;
    }
}
