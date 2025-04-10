package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingDescending {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(9,7,4,8,1);
        System.out.println("Sorted in Ascending :");
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("Sorted in Descending :");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}