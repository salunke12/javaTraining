import java.util.function.BiFunction;

public class BiFunctionMethodReferenceDemo {

    public static Integer addNumbers(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = BiFunctionMethodReferenceDemo::addNumbers;

        int result = adder.apply(10, 20);

        System.out.println("Sum: " + result);  
    }
}
