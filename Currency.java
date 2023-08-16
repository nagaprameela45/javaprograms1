import java.util.*;

class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        if (amount <= 0 || amount % 100 != 0) {
            System.out.println("Entered amount must be positive and multiples of 100.");
        } else {
            int thousands = amount / 1000;
            amount %= 1000;

            int fiveHundreds = amount / 500;
            amount %= 500;

            int hundreds = amount / 100;

            int totalNotes = thousands + fiveHundreds + hundreds;
            System.out.println("Total notes: " + totalNotes);
        }
    }
}