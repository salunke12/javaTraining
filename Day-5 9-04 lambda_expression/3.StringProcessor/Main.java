@FunctionalInterface
interface StringProcessor {
    String process(String input); 

    default String toUpperCase(String input) {
        return input.toUpperCase();
    }

    static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
public class Main {
    public static void main(String[] args) {
        
        StringProcessor removeSpaces = input -> input.replaceAll("\\s+", "");

        StringProcessor replaceVowels = input -> input.replaceAll("(?i)[aeiou]", "*");

        String testString = "Hello Functional Interface";

        System.out.println("Original: " + testString);
        System.out.println("Removed Spaces: " + removeSpaces.process(testString));
        System.out.println("Replaced Vowels: " + replaceVowels.process(testString));

        System.out.println("Uppercase (using default): " + removeSpaces.toUpperCase(testString));

        System.out.println("Reversed (using static): " + StringProcessor.reverse(testString));
    }
}
