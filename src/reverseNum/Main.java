package reverseNum;

public class Main {
    public static void main(String[] args) {
        int num = 34567;
        int newNum = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            newNum *= 10 ;
                    newNum += lastDigit;
            num /=10;
        }

        System.out.println(newNum);
    }


}
