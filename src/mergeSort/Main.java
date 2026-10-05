package mergeSort;

public class Main {

    static int comparisons = 0;
    static String lastLeft = "";
    static String lastRight = "";

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        if (left == 0 && right == arr.length - 1) {
            lastLeft = arrayToString(arr, left, mid);
            lastRight = arrayToString(arr, mid + 1, right);
        }

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            comparisons++;

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static String arrayToString(int[] arr, int from, int to) {
        String result = "";

        for (int i = from; i <= to; i++) {
            result += arr[i];

            if (i < to) {
                result += ",";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,9,4,3,1,2};
        //int[] arr = {6,2,4,0,3,8,7,5};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Merge Sort:");
        System.out.println(comparisons);
        System.out.println(lastLeft + " | " + lastRight);
    }
}