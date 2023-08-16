import java.util.Scanner;
public class Maximumelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxElement = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }

        System.out.println("The maximum element in the array is: " + maxElement);
    }
}