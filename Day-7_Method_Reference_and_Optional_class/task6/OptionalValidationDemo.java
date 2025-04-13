import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalValidationDemo {

    public static Optional<String> validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return Optional.of("Email is required.");
        }

        if (!email.contains("@") || !email.contains(".")) {
            return Optional.of("Invalid email format.");
        }

        return Optional.empty(); // Email is valid
    }

    public static void main(String[] args) {
    
        List<String> emails = Arrays.asList(
            "shreyas@example.com",
            "invalid-email",
            "",
            null,
            "test.user@domain.com"
        );

        for (String email : emails) {
            System.out.println("Checking: " + email);
            Optional<String> result = validateEmail(email);

            if (result.isPresent()) {
                System.out.println("Error " + result.get());
            } else {
                System.out.println("Email is valid.");
            }

            System.out.println("-----");
        }
    }
}
