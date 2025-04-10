import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Functional", "Programming");

        String longest = words.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("No strings in the list");

        System.out.println("Longest string: " + longest);
    }
}
