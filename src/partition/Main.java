package partition;

public class Main {

    static class PartitionResult {
        int pivotIndex;
        int firstElementAfterSwap;
        int swaps;

        PartitionResult(int pivotIndex, int firstElementAfterSwap, int swaps) {
            this.pivotIndex = pivotIndex;
            this.firstElementAfterSwap = firstElementAfterSwap;
            this.swaps = swaps;
        }
    }

    public static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            PartitionResult result = partition(A, left, right);

            quickSort(A, left, result.pivotIndex - 1);
            quickSort(A, result.pivotIndex + 1, right);
        }
    }

    public static PartitionResult partition(int[] A, int left, int right) {
        int pivot = A[left];

        int i = left + 1;
        int j = right;
        int swaps = 0;

        while (i <= j) {
            while (i <= j && A[i] <= pivot) {
                i++;
            }

            while (i <= j && A[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                swaps++;
            }
        }

        int temp = A[left];
        A[left] = A[j];
        A[j] = temp;
        swaps++;

        return new PartitionResult(j, A[left], swaps);
    }

    public static void main(String[] args) {
        int[] S = {6, 5, 9, 4, 8, 3, 1, 7, 2, 0};

        PartitionResult result = partition(S, 0, S.length - 1);

        System.out.println("Pivot index: " + result.pivotIndex);
        System.out.println("Pierwszy element po zamianie: " + result.firstElementAfterSwap);
        System.out.println("Liczba swapów: " + result.swaps);

        for (int x : S) {
            System.out.print(x + " ");
        }
    }
}