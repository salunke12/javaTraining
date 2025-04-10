import java.util.*;
import java.util.stream.*;

public class StreamTask3 {
    public static void main(String[] args) {
        
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(5, 12, 7, 15),
            Arrays.asList(3, 18, 12, 9),
            Arrays.asList(22, 5, 17, 1)
        );

        
        List<Integer> result = listOfLists.stream()
            .flatMap(List::stream)                         // Flatten
            .distinct()                                    //  Remove duplicates
            .filter(num -> num > 10)                       // Filter > 10
            .sorted()                                      // Sort ascending
            .collect(Collectors.toList());                 

        System.out.println("Final List: " + result);
    }
}
