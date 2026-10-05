package generics;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Key");
        map.put(2,"Key2");
        map.remove(2);
        System.out.println(map);
        Data<Integer, String> data = new Data<>(1, "Fosal");
        System.out.println(data.show());
    }
}
