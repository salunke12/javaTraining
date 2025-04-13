import java.util.*;


class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}

class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User("Shreyas", "shreyas@gmail.com"));
        users.add(new User("Aarav", "aarav@gmail.com"));
    }

    public Optional<User> getUserByEmail(String email) {
        return users.stream()
                    .filter(user -> user.getEmail().equalsIgnoreCase(email))
                    .findFirst(); // returns Optional<User>
    }
}

public class OptionalServiceDemo {
    public static void main(String[] args) {
        UserService userService = new UserService();

        Optional<User> foundUser = userService.getUserByEmail("shreyas@gmail.com");

        Optional<User> missingUser = userService.getUserByEmail("nonexistent@gmail.com");

        foundUser.ifPresent(user -> System.out.println("User found: " + user));
        if (!missingUser.isPresent()) {
            System.out.println("User not found!");
        }

        User fallback = missingUser.orElse(new User("Guest", "guest@gmail.com"));
        System.out.println("Fallback User: " + fallback);
    }
}
