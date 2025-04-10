import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask4 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "Java is awesome",
            "Streams are powerful",
            "Java streams are fast",
            "Java is fun"
        );

        Map<String, Long> wordCount = sentences.parallelStream()         
            .flatMap(sentence -> Arrays.stream(sentence.split(" ")))     // Split into words
            .map(String::toLowerCase)                             
            .collect(Collectors.groupingBy(                              //  Count words
                Function.identity(),
                Collectors.counting()
            ));

        wordCount.forEach((word, count) ->
            System.out.println(word + ": " + count));
    }
}
