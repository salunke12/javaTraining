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
        // Step 1: Create a HashMap with Integer (ID) as key and Employee as value
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        // Adding 5 employees to the HashMap
        employeeMap.put(101, new Employee(101, "Ram", 60000, 30));
        employeeMap.put(102, new Employee(102, "Shyam", 55000, 27));
        employeeMap.put(103, new Employee(103, "Aditya", 70000, 31));
        employeeMap.put(104, new Employee(104, "Sam", 80000, 29));
        employeeMap.put(105, new Employee(105, "Arun", 40000, 25));

        // Step 2: Retrieve an employee by ID
        int searchId = 103;
        Employee retrievedEmployee = employeeMap.get(searchId);
        if (retrievedEmployee != null) {
            System.out.println("\nRetrieved Employee (ID: " + searchId + "):");
            System.out.println(retrievedEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Step 3: Remove an employee using their ID
        int removeId = 102;
        Employee removedEmployee = employeeMap.remove(removeId);
        if (removedEmployee != null) {
            System.out.println("\nRemoved Employee (ID: " + removeId + "):");
            System.out.println(removedEmployee);
        } else {
            System.out.println("\nEmployee with ID " + removeId + " not found.");
        }

        // Step 4: Print all employee details
        System.out.println("\nAll Employees after removal:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
