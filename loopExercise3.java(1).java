// Write a program to print the multiplication table of any number of your choice

class Exercise3 {

	public static void main(String args[]) {
    int number=7;
    int limit=10;
       System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

