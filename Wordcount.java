import java.util.Scanner;
public class Wordcount 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); 
if (words.length > 0)
{
            String lastWord = words[words.length - 1];
            System.out.println("Last word: " + lastWord);
        } else {
            System.out.println("No words found.");
        }

    }
}

      

      
      
  