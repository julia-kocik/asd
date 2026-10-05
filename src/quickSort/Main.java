package quickSort;

public class Main {

    public static void main(String[] args) {
        int[] S = {6, 5, 9, 4, 8, 3, 1, 7, 2, 0};

        quickSort(S, 0, S.length - 1);

        for (int x : S) {
            System.out.print(x + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {return;}
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while(i <= j) {
            while(i <= j && arr[i] <= pivot) {
                i++;
            }
            while(i <= j && arr[j] > pivot) {
                j--;
            }
            if(i < j) {
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
