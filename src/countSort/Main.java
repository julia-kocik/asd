package countSort;

public class Main {

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //int[] S = {5,5,5,1,1,3,5,4,1,1,5,0,0,3,4};
        int[] S = {2,2,4,2,5,3,5,2,1,0,1,5,0,2,0};
        int max = 0;
        for (int x : S) {
            if (x > max) {
                max = x;
            }
        }

        int[] counts = new int[max + 1];

        // faza 1: zliczanie
        for (int x : S) {
            counts[x]++;
        }

        System.out.println("Count Sort:");
        printArray(counts);

        // faza 2: sumowanie
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        printArray(counts);

        // faza 3: wypisywanie do tablicy wyjściowej
        int[] output = new int[S.length];

        for (int i = S.length - 1; i >= 0; i--) {
            int x = S[i];
            output[counts[x] - 1] = x;
            counts[x]--;
        }

        printArray(counts);
    }
}
