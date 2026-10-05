package twopointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String p = "axc", r = "ahbgdc", s = "abc", t =  "ahbgdc";
        System.out.println(isSubsequence(p, r));
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        //czego aktualnie szukam
        int i = 0;
        //gdzie aktualnie szukam
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
