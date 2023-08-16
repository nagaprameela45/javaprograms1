import java.util.Scanner;
class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
   String capitalizedSentence = capitalizeWords(sentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }

    public static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder();
String[] words = sentence.split("\\s+");

         for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalizedWord).append(" ");
            }
        }

        // Remove trailing whitespace
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}