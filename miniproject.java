import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.lang.Exception;
class Employee
  {
    int empid;
    String ename;
    int age;
    String position;
    double salary;
    String mobileno;
    Employee(int empid,String ename,int age,String position,double salary,String mobileno)
    {
      this.empid=empid;
      this.ename=ename;
      this.age=age;
      this.position=position;
      this.salary=salary;
      this.mobileno=mobileno;
    }
  }
class EmployeeNotFoundException extends Exception
  {
    EmployeeNotFoundException(String message)
    {
      super(message);
    }
  }
class EmployeeManagement
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<Employee>el=new ArrayList<Employee>();
    public void addEmployee()
    {
      int id;
        while(true)
        {
          System.out.println("Enter Employee Id");
           id=sc.nextInt();
          sc.nextLine();
          boolean isUnique=true;
          for(Employee value:el)
            {
              if(value.empid==id)
              {
                System.out.println("enter unique id only");
                isUnique=false;
                break;
              }
            }
          if(isUnique)
          {
            System.out.println("id entered");
            break;
          }
        }
      System.out.println("Enter Employe eName");
      String ename=sc.nextLine();
      System.out.println("Enter Employee age");
      int age=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter Employee Position");
      String position=sc.nextLine();
      System.out.println("Enter Employee Salary");
      double salary=sc.nextDouble();
      String mobile;
      while(true)
        {
          System.out.println("enter a mobile number");
          mobile=sc.next();
          if(mobile.length()==10 && (mobile.startsWith("9")||mobile.startsWith("8")||mobile.startsWith("7")||mobile.startsWith("6")))
          {
            System.out.println("Mobile number is valid");
            break;
          }
          else{
            System.out.println("enter valid mobile number");
          }
       }
      Employee e1=new 
      Employee(id,ename,age,position,salary,mobile);
      el.add(e1);
      System.out.println("Employee Added");
    }
    public void viewEmployees()
    {
      if(el.size()>0)
      {
        System.out.println("All Employee deatils are");
      for(Employee data:el)
        {
          System.out.println(data.empid+" "+data.ename+" "+data.age+" "+data.position+" "+data.salary+" "+data.mobileno);
        }
    }
      else
      {
        System.out.println("The List is Empty");
      }
    }
   public void searchEmployee()throws EmployeeNotFoundException  
    {
      System.out.println("Enter 1 for Search for UserId \n Enter 2 For Search for name \n Enter 3 for Search by position \n Enter 4 for Search by age to");
      int choice=sc.nextInt();
      sc.nextLine();
          switch(choice)
            {
                case 1:
                System.out.println("enter the employee id to search");
            int searchById=sc.nextInt();
          for(Employee value:el)
         {
          int data=value.empid;
          if(data==(searchById))
          {
            System.out.println(value.empid+" "+value.ename+" "+value.age+" "+value.position+" "+value.salary+" "+value.mobileno);
          }
           else
          {
            throw new EmployeeNotFoundException("For this Id No Employee is not Found in list \n exception handled");
          }
        }
                break;
              case 2:
                System.out.println("enter the employee name to search");
            String searchByName=sc.nextLine();
          for(Employee value:el)
         {
          String data=value.ename;
          if(data.equals(searchByName))
          {
            System.out.println(value.empid+" "+value.ename+" "+value.age+" "+value.position+" "+value.salary+" "+value.mobileno);
            
          }
           else
          {
            throw new EmployeeNotFoundException("For this Name No Employee is not Found in list \n exception handled");
          }
        }
            break;
              case 3:
                System.out.println("enter the employee position to search");
                String searchByPosition=sc.nextLine();
          for(Employee value:el)
         {
          String data=value.position;
          if(data.equals(searchByPosition))
          {
            System.out.println(value.empid+" "+value.ename+" "+value.age+" "+value.position+" "+value.salary+" "+value.mobileno);
          }
           else
          {
            throw new EmployeeNotFoundException("For this Position No Employee is not Found in list \n exception handled");
          }
         }
                 break;
              case 4:
                System.out.println("enter the employee age to search");
            int searchByAge=sc.nextInt();
          for(Employee value:el)
         {
          int data=value.age;
          if(data==(searchByAge))
          {
            System.out.println(value.empid+" "+value.ename+" "+value.age+" "+value.position+" "+value.salary+" "+value.mobileno);
          }
           else
          {
            throw new EmployeeNotFoundException("For this Age No Employee is not Found in list \n exception handled");
          }
        }
                break;
              default:
                System.out.println("Invalid Option Try Again");
            }
            } 
    public void updateData()
    {
      System.out.println("Enter Employee Id You want to update the Deatails");
      int id=sc.nextInt();
      sc.nextLine();
      for(Employee value:el)
        {
          if(value.empid==id)
          {
            System.out.println("Enter the Option \n a.Update the Employee Name \n b.Update Employee Age \n c.Update the Employee Position \n d.Update the Employee Salary \n e.Update the Employee MobileNo");
            char ch=sc.next().charAt(0);
            switch(ch)
            {
              case 'a':
                System.out.println("Enter the name You want to upadte");
                String name=sc.next();
                for(Employee value1:el)
                  {
                    if(value1.empid==id)
                    {
                value1.ename=name;
                      System.out.println("Employee Name Updated");
                  }
                  }
                break;
              case 'b':
                System.out.println("Enter the Age you want to update");
                int eage=sc.nextInt();
                for(Employee value2:el)
                  {
                  if(value2.empid==id)
                  {
                    value2.age=eage;
                    System.out.println("Age updated");
                  }
                  }
                break;
              case 'c':
                System.out.println("Enter the Position you want to Upadte");
                String pos=sc.next();
                for(Employee value3:el)
                  {
                    if(value3.empid==id)
                    {
                value3.position=pos;
                      System.out.println("Position Updated");
                    }
                  }
                break;
              case 'd':
                System.out.println("Enter the Salary you want to Update");
                double sal=sc.nextDouble();
                for(Employee value4:el)
                  {
                    if(value4.empid==id)
                    {
                value.salary=sal;
                      System.out.println("Salary Updated");
                    }
                  }
                break;
              case 'e':
                System.out.println("Enter the Mobile no you want to update");
                String no=sc.next();
                for(Employee value5:el)
                  {
                    if(value5.empid==id)
                    {
                      value.mobileno=no;
                      System.out.println("Mobile No Updated");
                    }
                  }
                break;
              default:
                System.out.println("Invalid Input please Reenter");
                break;
            }
          }
          else
          {
            System.out.println("The Id you enter is not found in the data");
          }
        }
    }
    public void deleteEmployee()
    {
      System.out.println("enter the employee id to delete");
      int id=sc.nextInt();
      Iterator<Employee> itr=el.iterator();
      while(itr.hasNext())
        {
           Employee value=itr.next();
          if(value.empid==id)
          {
           itr.remove();
            break;
        }
        }
      System.out.println("Employee Details Deleted");
    }
    public void calculateSalary()
    {
      double totalSalary=0.0;
      for(Employee value:el)
        {
          totalSalary=totalSalary+value.salary;
        }
      System.out.println("Total Salary Expences Alloted to Employees Are : "+totalSalary);
    }
    public void SearchByAgeRange()
    {
      if(el.size()>0)
      {
        boolean employeeFound=false;
        System.out.println("Enter starting age");
        int startAge=sc.nextInt();
        System.out.println("Enter ending age");
        int endAge=sc.nextInt();
        for(Employee value:el)
          {
            if(value.age>=startAge && value.age<=endAge)
            {
              System.out.println(value.empid+" "+value.ename+" "+value.age+" "+value.position+" "+value.salary+" "+value.mobileno);
              employeeFound=true;
            }
          }
        if(employeeFound==false)
        {
          System.out.println("no employee is present in that age range");
        }
      }
    }
public static void main(String[]args)
  {
  Scanner se=new Scanner(System.in);
  EmployeeManagement em=new EmployeeManagement();
  do
    {
      System.out.println("Choose any Option \n 1.Add employee \n 2.View All Employees \n 3.Search For the Employee \n 4.Update the Employee information basing on Employee id \n 5.Delete an Employee \n 6.Calculate Salary \n 7.Search For the Employee By Age Range \n 8.Exit");
      int choice=se.nextInt();
      switch(choice)
        {
          case 1:
            System.out.println("Enter Employee Details");
            em.addEmployee();
            break;
          case 2:
            em.viewEmployees();
            break;
          case 3:
            try
              {
                em.searchEmployee();
              }
            catch(EmployeeNotFoundException e)
              {
                System.out.println(e);
              }
             break;
         case 4:
            em.updateData();
            break;
          case 5:
            em.deleteEmployee();
            break;
          case 6:
            em.calculateSalary();
            break;
          case 7:
           em.SearchByAgeRange();
            break;
          case 8:
            System.exit(0);
          default:
            System.out.println("Invalid Option Please Reenter");
            break;
        }
    }while(true);
  }
  }