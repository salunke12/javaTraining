import java.util.Optional;

public class OptionalEnumParser {

    public static <T extends Enum<T>> Optional<T> parseEnum(Class<T> enumClass, String name) {
        try {
            return Optional.of(Enum.valueOf(enumClass, name.toUpperCase())); 
        } catch (IllegalArgumentException e) {
            return Optional.empty(); 
        }
    }

   
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        String input1 = "Monday";
        String input2 = "Funday";

        Optional<Day> day1 = parseEnum(Day.class, input1);
        Optional<Day> day2 = parseEnum(Day.class, input2);

        day1.ifPresent(d -> System.out.println("Parsed enum: " + d));
        System.out.println("Result 2: " + day2.orElse(null)); 

    }
}
