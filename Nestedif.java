class Nestedif
  {
    public static void main(String args[]){
      int age=30;
      String country="india";
      if(age>18)
        {
          System.out.println("you are eligible to vote");
        }
      else
        {
          System.out.println("you are not eligible to vote");
        }
      if(country == "india")
      {
        System.out.println("you are from india");
      }
      else{
        System.out.println("you are not from india");
      }
    }
  }
