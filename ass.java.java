/* Write a program to print the following right angle traingle pattern:
1
22
333
4444
55555
*/
class Exercise2 {

	public static void main(String args[]) {
    int n=5;
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

