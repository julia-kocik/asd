package binSearch;

public class Main {

    public static void main(String[] args) {

        int[] S = {13,24,38,47,53,55,56,63,83,85,86,97};
        int key = 13;

//        int[] S = {7,13,17,25,30,41,52,58,60,61,80,85};
//        int key = 60;

//        int[] S = {1,3,5,7,9,11,13,15,17};
//        int key = 7;

        int left = 0;
        int right = S.length - 1;

        String visited = "";
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (visited.length() > 0) {
                visited += ",";
            }
            visited += mid;

            if (S[mid] == key) {
                result = mid;
                break;
            }

            if (key < S[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Binary Search:");
        System.out.println(visited);
        System.out.println(result);
    }
}
