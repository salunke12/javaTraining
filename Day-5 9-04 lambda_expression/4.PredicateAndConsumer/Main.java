import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);

        // consumer to print each element
        System.out.println("\nAll numbers using Consumer:");
        Consumer<Integer> printElement = num -> System.out.println(num);
        numbers.forEach(printElement);

        // sample list of strings
        List<String> words = Arrays.asList("Java", "Lambda", "Stream", "Function");

        // function to get string lengths
        Function<String, Integer> stringLength = str -> str.length();
        List<Integer> lengths = words.stream()
                                     .map(stringLength)
                                     .collect(Collectors.toList());

        System.out.println("\nString lengths:");
        lengths.forEach(System.out::println);
    }
}
