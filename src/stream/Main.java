package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(3,4,5,6,7, 10, 15);
        List<Integer> newArr = arr.stream().filter(e -> e >= 10).toList();
        System.out.println(newArr);




        List<Integer> list = Arrays.asList(5, 2, 8, 1);
        list.sort((a, b ) -> a - b);
        List<Integer> list2 =  list
                .stream()
                .map((n)->n*2)
                .filter((n) -> n > 2)
                .toList();
        System.out.println(list2);

    }
}
