package stringCompression;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','c','d','d','d','d'};

        int result = compress(chars);

        System.out.println(result);

        for (int i = 0; i < result; i++) {
            System.out.print(chars[i] + " ");
        }
    }
        public static int compress(char[] chars) {
            //zapis wyniku
            int write = 0;
            //początek aktualnej grupy
            int i = 0;

            //dopóki nie przjedziemy całej tablicy
            while(i < chars.length) {
                //szukamy końca grupy
                int j = i;
                //j idzie do przodu poki litery są takie same
                while(j < chars.length && chars[j] == chars[i]) {
                    j++;
                }
                //długość grupy
                int count = j-i;


                //zapisujemy literę
                chars[write++] = chars[i];
                //czy zapisujemy liczbę?
                //zamiana liczby na napis i zamiana na array charów
                if(count > 1) {
                    for(char c: String.valueOf(count).toCharArray()) {
                        //zapisujemy liczbę
                        chars[write++] = c;
                    }
                }


                //przechodzimy do następnej grupy
                i = j;
            }
            return write;
        }



}
