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
        // Step 1: Create a Stack of Employees
        Stack<Employee> employeeStack = new Stack<>();

        // Step 2: Push 5 employees onto the stack
        employeeStack.push(new Employee(101, "Ram", 60000, 30));
        employeeStack.push(new Employee(102, "Shyam", 55000, 27));
        employeeStack.push(new Employee(103, "Aditya", 70000, 31));
        employeeStack.push(new Employee(104, "Sam", 80000, 29));
        employeeStack.push(new Employee(105, "Arun", 40000, 25));

        // Step 3: Pop an employee
        Employee poppedEmployee = employeeStack.pop();
        System.out.println("\nPopped Employee (Last Added, Now Removed):");
        System.out.println(poppedEmployee);

        // Step 4: Peek at the top employee without removing it
        Employee topEmployee = employeeStack.peek();
        System.out.println("\nTop Employee (Without Removal):");
        System.out.println(topEmployee);

        // Step 5: Search for an employee 
        Employee searchEmployee = new Employee(103, "Aditya", 70000, 31);
        int position = employeeStack.search(searchEmployee);
        if (position != -1) {
            System.out.println("\nEmployee found at position: " + position);
        } else {
            System.out.println("\nEmployee not found in stack.");
        }

        // Step 6: Check if the stack is empty
        System.out.println("\nIs stack empty? " + employeeStack.isEmpty());

        // Step 7: Print all employees in the stack
        System.out.println("\nEmployees in Stack:");
        for (Employee emp : employeeStack) {
            System.out.println(emp);
        }
    }
}
