import java.util.Scanner;
class CharacterOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to search: ");
        char targetChar = scanner.next().charAt(0);

        int[] occurrenceIndices = findAllOccurrences(inputString, targetChar);

        if (occurrenceIndices.length > 0) {
            System.out.print("Occurrences of '" + targetChar + "' at indices: ");
            for (int index : occurrenceIndices) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }

        scanner.close();
    }

    public static int[] findAllOccurrences(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        int[] occurrenceIndices = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                occurrenceIndices[index] = i;
                index++;
            }
        }

        return occurrenceIndices;
    }
}