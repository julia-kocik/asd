package exp;

public class Main {
    public static void main(String[] args) {
        System.out.println(exp(2, 0));
    }
    public static int exp(int a, int b) {
        int res = 1;
        int i = 0;
        while (i < b) {
            res = a*res;
            i++;
        }
        return res;
    }
}
