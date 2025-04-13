import java.util.*;
public class evenChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45,26,78,22,1,65,33,28);
        numbers.stream().filter(x -> x%2 ==0).forEach(System.out::println);
        
    }
}