import java.util.Scanner;
class Percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter maximum marks: ");
        double maxMarks = s.nextDouble();
        System.out.print("Enter total marks: ");
        double totalMarks = s.nextDouble();
        double percentage = (totalMarks / maxMarks) * 100;
        int roundedPercentage = (int) Math.round(percentage);
        System.out.println("Percentage: " + roundedPercentage + "%");
    }
} 
 