import java.util.Scanner;

public class Employee {
    // Private variables to restrict direct access
    private String name;
    private int age;
    private double salary;

    // Public getter for 'name'
    public String getName() {
        return name;
    }

    // Public setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for 'age'
    public int getAge() {
        return age;
    }

    // Public setter for 'age'
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    // Public getter for 'salary'
    public double getSalary() {
        return salary;
    }

    // Public setter for 'salary'
    public void setSalary(double salary) {
        if (salary >= 0) { // Validation logic
            this.salary = salary;
        } else {
            System.out.println("Salary must be non-negative.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        // Taking user input for Employee details
        System.out.print("Enter Employee Name: ");
        emp.setName(scanner.nextLine());

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();
        emp.setAge(age);

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        emp.setSalary(salary);

        // Displaying the details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: $" + emp.getSalary());
        
        scanner.close();
    }
}