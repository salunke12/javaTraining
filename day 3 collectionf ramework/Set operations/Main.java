import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Overriding equals() to compare employees by ID and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }

    // Overriding hashCode() to ensure unique hashing based on ID and name
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a HashSet and add 5 employees
        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(101, "Ram", 60000, 30));
        employeeSet.add(new Employee(102, "Shyam", 55000, 27));
        employeeSet.add(new Employee(103, "Aditya", 70000, 31));
        employeeSet.add(new Employee(104, "Sam", 80000, 29));
        employeeSet.add(new Employee(105, "Arun", 40000, 25));

        // Step 2: Try adding a duplicate employee
        boolean added = employeeSet.add(new Employee(101, "Ram", 60000, 30));
        System.out.println("\nAttempt to add duplicate employee: " + (added ? "Success" : "Failed (Duplicate Ignored)"));

        // Step 3: Print all employees (check for duplicates)
        System.out.println("\nEmployee Set:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

        // Step 4: Check if a specific employee exists in the set
        Employee searchEmployee = new Employee(103, "Aditya", 70000, 31);
        boolean exists = employeeSet.contains(searchEmployee);
        System.out.println("\nDoes Employee " + searchEmployee.name + " exist in the set? " + (exists ? "Yes" : "No"));
    }
}
