package slidingWindow;

public class MaxNumOfVowels {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
    }

    public static int maxVowels(String s, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                windowSum++;
            }
        }

        int maxSum = windowSum;

        if (maxSum == k) {
            return k;
        }

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                windowSum--;
            }

            if (isVowel(s.charAt(i))) {
                windowSum++;
            }

            maxSum = Math.max(maxSum, windowSum);

            if (maxSum == k) {
                return k;
            }
        }

        return maxSum;
    }
    private static boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
//    private boolean isVowel(char c) {
//        return c == 'a' ||
//                c == 'e' ||
//                c == 'i' ||
//                c == 'o' ||
//                c == 'u';
//    }
}
