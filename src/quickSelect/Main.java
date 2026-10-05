package quickSelect;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 2, 1, 1, 2, 3, 4, 5, 6, 7, 9};

        int k = 11; // 11. najmniejszy element
        System.out.println(quickSelect(arr, 0, arr.length - 1, k - 1));
        System.out.println(simpleSearch(arr, 11));
        System.out.println(linSelect(arr, 11));
    }

    public static int simpleSearch(int[] arr, int k) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy[k - 1];
    }

    public static int linSelect(int[] arr, int k) {
        int[] copy = arr.clone();

        for (int count = 1; count <= k; count++) {
            int minIndex = 0;

            for (int i = 1; i < copy.length; i++) {
                if (copy[i] < copy[minIndex]) {
                    minIndex = i;
                }
            }

            if (count == k) {
                return copy[minIndex];
            }

            copy[minIndex] = Integer.MAX_VALUE;
        }

        return -1;
    }


    public static int quickSelect(int[] arr, int left, int right, int key) {
        if (key < 0 || key >= arr.length) {
            throw new IllegalArgumentException("Niepoprawna wartość k");
        }

        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);

        if (pivotIndex == key) {
            return arr[pivotIndex];
        }

        if (key < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, key);
        }

        return quickSelect(arr, pivotIndex + 1, right, key);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while (i <=j ) {
            while(i <= j && arr[i] <= pivot) {
                i++;
            }
            while(i <= j && arr[j] > pivot) {
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }
}
