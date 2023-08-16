import java.util.Scanner;
 class Oddnumsum {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
 int[] intArr = new int[size];
System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++) {
            intArr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (intArr[i] % 2 != 0) {
                sum += intArr[i];
            }
        }

        System.out.println("Sum of all odd numbers in the array is : " + sum);
    }

}


  