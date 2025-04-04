import java.util.*;

class Employee{
    int id;
    String name;
    double salary;
    int age;
    
    public Employee( int id, String name, double salary, int age){
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
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new Employee(101, "Ram",60000,30));
        employeeList.add(new Employee(102, "Shyam",55000,27));
        employeeList.add(new Employee(103, "Aditya",70000,31));
        employeeList.add(new Employee(104, "Sam",80000,29));
        employeeList.add(new Employee(105, "Arun",40000,25));
        
        System.out.println("Employee List: ");
        for (Employee emp : employeeList){
            System.out.println(emp);
        }
        
        employeeList.remove(1); // remove 2nd employee
        employeeList.sort(Comparator.comparingDouble( emp -> emp.salary));
        
        
        System.out.println("\nSorted according to salary Employee List: ");
        for (Employee emp : employeeList){
            System.out.println(emp);
        }
        Employee highestPaid = Collections.max(employeeList, Comparator.comparingDouble(emp -> emp.salary));
        
        System.out.println("\nHighest Paid employee is: ");
        System.out.println(highestPaid);
        
        LinkedList<Employee> employeeLinkedList = new LinkedList<>(employeeList);
        for (Employee emp : employeeLinkedList){
            System.out.println(emp);
        }
        System.out.println("All empoyee in Linked List");
        employeeLinkedList.add(new Employee(106, "Rahul", 65000, 28));
        employeeLinkedList.add(new Employee(107, "Vikas", 50000, 26));
        employeeLinkedList.add(new Employee(108, "Kunal", 75000, 32));
        employeeLinkedList.add(new Employee(109, "Suresh", 72000, 34));
        employeeLinkedList.add(new Employee(110, "Mahesh", 68000, 29));
        employeeLinkedList.add(new Employee(111, "Tanish", 54000, 30));
        employeeLinkedList.add(new Employee(112, "Sahil", 75000, 27));
        employeeLinkedList.add(new Employee(113, "Druv", 85000, 31));
        employeeLinkedList.add(new Employee(114, "Pranay", 90000, 35));
        employeeLinkedList.add(new Employee(115, "Rohit", 40000, 25));
        for (Employee emp : employeeLinkedList){
            System.out.println(emp);
        }
        
          // Retrieve the 3rd employee (index 2)
        Employee thirdEmployee = employeeLinkedList.get(2);
        System.out.println("\n3rd Employee: " + thirdEmployee);
        
        // Replace the employee at index 2
        employeeLinkedList.set(2, new Employee(103, "Amit", 73000, 33));
        System.out.println("\nAfter replacing the 3rd employee:");
        for (Employee emp : employeeLinkedList) {
            System.out.println(emp);
        }
        // Remove an employee by name
        String nameToRemove = "Sam";
        boolean removed = employeeList.removeIf(emp -> emp.name.equals(nameToRemove));

        if (removed) {
            System.out.println("\nEmployee '" + nameToRemove + "' removed successfully.");
        } else {
            System.out.println("\nEmployee '" + nameToRemove + "' not found.");
        }
        // Display final list
        System.out.println("\nFinal Employee List:");
        for (Employee emp : employeeLinkedList) {
            System.out.println(emp);
        }
    }
}