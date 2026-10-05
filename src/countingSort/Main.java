package countingSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,5,5,1,1,3,5,4,1,1,5,0,0,3,4};
        countingSort(arr);
        for(int i:arr) {
            System.out.print(i+ " ");
        }
    }
    public static void countingSort(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index] = i;
                index++;

                count[i]--;
            }
        }
    }
}
