package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3};
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(13);
        System.out.println(Arrays.stream(myArray).boxed().toList());
        int[] result = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result));

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.remove("USA");
        capitalCities.remove("Germany", "Berlin");
        capitalCities.remove("England", "Cambridge");

        System.out.println(capitalCities);
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        System.out.println(test);
    }

}
