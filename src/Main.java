import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> list = new ArrayList<>();

        for (int x : input) {
            if (x > 0 && x % 2 == 0) {
                list.add(x);
            }
        }

        Collections.sort(list);

        for (int x : list) {
            System.out.println(x);
        }
    }
}