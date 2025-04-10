import java.util.*;
import java.util.stream.*;

public class StreamTask5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anuj", "Param", "Chirag", "Daksh", "Pavan", "Aditya", "Purav", "Sam");

        // 1. Convert all names to uppercase
        List<String> upperNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperNames);

        // 2. Count how many names start with the letter 'A'
        long countStartsWithA = names.stream()
            .filter(name -> name.startsWith("A"))
            .count();
        System.out.println("Names starting with 'A': " + countStartsWithA);

        // 3. Group names by their length
        Map<Integer, List<String>> groupedByLength = names.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);

        // 4. Create a comma-separated string of all names
        String csvNames = names.stream()
            .collect(Collectors.joining(", "));
        System.out.println("Comma-separated names: " + csvNames);

        // 5. Use peek() to print each name while processing (debugging)
        List<String> debugged = names.stream()
            .peek(name -> System.out.println("Processing: " + name))
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        // 6. Use parallel stream and show thread names via peek()
        List<String> parallelProcessed = names.parallelStream()
            .peek(name -> System.out.println("Thread: " + Thread.currentThread().getName() + " - " + name))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Processed in parallel (uppercase): " + parallelProcessed);
    }
}
