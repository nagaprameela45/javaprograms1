import java.util.Scanner;
 class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.next().charAt(0);

        int count = countOccurrences(inputString, targetChar);

        System.out.println("Occurrences of '" + targetChar + "' in the string: " + count);

        scanner.close();
    }

    public static int countOccurrences(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}
