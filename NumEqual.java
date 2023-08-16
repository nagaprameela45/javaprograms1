import java.util.Scanner;
class NumEqual
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        String result = (num1 == num2) ? "is" : "is not";
        System.out.println(num1 + " and " + num2 + " " + result + " equal");
    }
}