package playground;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {11,23,44,56,77,89};
        System.out.println(binSearch(array, 77));
    }
    public static int binSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int mid = (left+right)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

}
