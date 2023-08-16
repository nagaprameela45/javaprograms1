/*Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:

employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
 

The program should allow the user to input data for each employee dynamically with the following validations:

employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
 

After collecting the data for five employees, display the details for all five employees.

Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/
import java.util.*;

 

class Employee {
    int id;
    String name;
    long mobileno;

 

    void insert(int id, String name, long mobileno) {
        this.id = id;
        this.name = name;
        this.mobileno = mobileno;
    }
}

 

class Employee1{
  
public static void main(String args[]) {
        int size = 4;
        Employee[] employees = new Employee[size];

 

        Scanner sc = new Scanner(System.in);

 

        for (int i = 0; i < size; i++) {
            employees[i] = new Employee();
            System.out.println("Enter employee id");
            int id = sc.nextInt();

 

            // Name validation
            String name;
            while (true) {
                System.out.println("Enter employee name");
                name = sc.next();
                if (name.length() >= 4 && name.length() <= 40) {
                    System.out.println("Name is valid");
                    break;
                } else {
                    System.out.println("Enter a valid name (between 4 and 40 characters)");
                }
            }

 

            System.out.println("Enter mobile number");
            long mobile = sc.nextLong();

 

            employees[i].insert(id, name, mobile);
        }

 

        System.out.println("Displaying details");
        for (Employee emp : employees) {
            System.out.println(emp.id + " " + emp.name + " " + emp.mobileno);
        }

 

        sc.close();
    }
}

