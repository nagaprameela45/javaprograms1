import java.util.Scanner;
 class Average {
 public static void main(String[] args)
{       
    int i,n=0,s=0;
	float avg;
	{
	     System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner sc= new Scanner(System.in);
		    n = sc.nextInt();
		    s +=n;
	}
	avg=s/5;
	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
 
}
}