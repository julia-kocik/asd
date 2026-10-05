package insertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,1,8,2,3,9,4};
        insertionSort(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int[] A) {

        for (int i = 1; i < A.length; i++) {

            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = key;
        }
    }
}
