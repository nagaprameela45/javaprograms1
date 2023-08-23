/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.marks, this.marks); // Sort in descending order of marks
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(scanner.nextLine());

            students.add(new Student(name, marks));
        }

        try (PrintWriter writer = new PrintWriter("studentdetails.txt")) {
            for (Student student : students) {
                writer.println(student.getName() + ", " + student.getMarks());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(students);

        if (!students.isEmpty()) {
            Student topStudent = students.get(0);
            System.out.println("Student with top score: " + topStudent.getName() +
                               " with marks: " + topStudent.getMarks());
        } else {
            System.out.println("No students data to display.");
        }
    }
}