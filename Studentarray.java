S/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object*/
class Student
  {
    String name;
    int rollno;
    char grade;
    public void display(String n,rollno r,grade g)
    {
      name=n;
      rollno=r;
      grade=g;
    }
    public static void main(String args[])
    {
      Student students[] = new Student[3];
      students[0] = new Student("Alice", 101, "A");
        students[1] = new Student("Bob", 102, "B");
        students[2] = new Student("Charlie", 103, "A-");
      for (int i = 0; i < students.length; i++) 
      {
            System.out.println("Student " + (i + 1) + " - Name: " + students[i].name);
            System.out.println("Roll Number: " + students[i].rollNumber);
            System.out.println("Grade: " + students[i].grade);
            System.out.println();
        }
    }
}
